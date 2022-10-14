package br.com.comex.dao;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class CategoriaDao {

		public void insere(Categoria categoria) throws SQLException {
			String sql = "INSERT INTO comex.categoria " 
			           + "  (NOME,STATUS) " 
					   + "VALUES "
					   + "  (?, ?) ";

			String[] colunaId = { "id" };
			
			PreparedStatement state = state.prepareStatement(sql, colunaId);
			state.setString(1, nome);
			state.setString(2, status.name());	
			state.execute();

			state.execute();

			ResultSet rs = comando.getGeneratedKeys();
			rs.next();
			
			categoria.setId(rs.getLong(1));

			state.close();
		}

		public List<Conta> listaTodas() throws SQLException {
			PreparedStatement comandoPreparado = conexao.prepareStatement("select * from banco.conta");
			
			List<Conta> contas = new ArrayList<>();
			ResultSet registros = comandoPreparado.executeQuery();
			while (registros.next()) {
			 	contas.add(this.populaConta(registros));
			}
			
			registros.close();
			comandoPreparado.close();
			
			return contas;
		}
		
		public void exclui(Long id) throws SQLException {
			String sql = "delete from banco.conta where id = ?";
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setLong(1, id);
			ps.execute();
			
			ps.close();
		}
		
		public void altera(Conta conta) throws SQLException {
			String sql = "update banco.conta "
					   + "   set agencia = ?, "
					   + "       numero  = ?, "
					   + "       cliente = ?, "
					   + "       saldo   = ? "
					   + " where id = ?";
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setLong(1, conta.getAgencia());
			ps.setString(2, conta.getNumero());
			ps.setString(3, conta.getCliente());
			ps.setBigDecimal(4, conta.getSaldo());
			ps.setLong(5, conta.getId());
			ps.execute();
			
			ps.close();
		}

		public Conta buscaPorId(long id) throws SQLException {
			String sql = "select * from banco.conta where id = ?";
			
			try (PreparedStatement ps = this.conexao.prepareStatement(sql)) {
				ps.setLong(1, id);
				
				try (ResultSet registro = ps.executeQuery()) {
					Conta conta = null;
					if (registro.next()) {
						conta = this.populaConta(registro);
					}
						
					return conta;
				}
			}
		}
		
		private Conta populaConta(ResultSet registro) throws SQLException {
			Conta conta = new Conta(
				registro.getLong("agencia"), 
				registro.getString("numero"), 
				registro.getString("cliente"), 
				registro.getBigDecimal("saldo")
			);
			
			conta.setId(registro.getLong("id"));
			return conta;
		}
	}
}
