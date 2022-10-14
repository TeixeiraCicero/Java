package br.com.comex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.StatusCategoria;

public class CategoriaDao {
	
	private Connection conect;
	
public CategoriaDao(Connection conect) {
	
}
		public void insere(Categoria categoria) throws SQLException {
			String sql = "INSERT INTO comex.categoria " 
			           + "(NOME,STATUS) " 
					   + "VALUES "
					   + "(?, ?) ";

			String[] colunaId = { "id" };
			PreparedStatement state = conect.prepareStatement(sql, colunaId);
			state.setString(1, categoria.getNome());
			state.setString(2, categoria.getStatus().name());	
			state.execute();

			ResultSet rs = state.getGeneratedKeys();
			rs.next();
			categoria.setId(rs.getInt(1));
			state.close();
		}

		public List<Categoria> listaTodas() throws SQLException {
			PreparedStatement comandoPreparado = conect.prepareStatement("select * from banco.conta");
			
			List<Categoria> categorias = new ArrayList<>();
			ResultSet registros = comandoPreparado.executeQuery();
			while (registros.next()) {
			 	categorias.add(this.criaCategoria(registros));
			}
			
			registros.close();
			comandoPreparado.close();
			
			return categorias;
		}
		
		public void exclui(Integer id) throws SQLException {
			String sql = "DELETE FROM comex.categoria WHERE ID = ?";
			
			PreparedStatement state = conect.prepareStatement(sql);
			state.setInt(1, id);
			state.execute();
			
			state.close();
		}
		
		public void altera(Categoria categoria) throws SQLException {
			String sql = "UPDATE comex.categoria "
					   + "   SET NOME = ?, "
					   + "   SET STATUS = ?, "
					   + " WHERE ID = ?";
			
			PreparedStatement state = conect.prepareStatement(sql);
			state.setString(1, categoria.getNome());
			state.setString(2, categoria.getStatus().name());
			state.setInt(3,categoria.getId());
			state.execute();
			
			state.close();
		}

		public Categoria buscaPorId(Integer id) throws SQLException {
			String sql = "SELECT * FROM comex.categoria WHERE ID = ?";
			
			try (PreparedStatement state = this.conect.prepareStatement(sql)) {
				state.setInt(1, id);
				
				try (ResultSet registro = state.executeQuery()) {
					Categoria categoria = null;
					if (registro.next()) {
						categoria = this.criaCategoria(registro);
					}
						
					return categoria;
				}
			}
		}
		
		private Categoria criaCategoria(ResultSet registro) throws SQLException {
			Categoria categoria = new Categoria(
				registro.getString("nome")
			);
			
			categoria.setId(registro.getInt("id"));
			return categoria;
		}
}

