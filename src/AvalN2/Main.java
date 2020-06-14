package AvalN2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	 public static void main(String[] args) {
		  String connectionUrl =
	                "jdbc:sqlserver://localhost;"
	                        + "database=AvaliacaoN2;"
	                        + "user=exemplobanco;"
	                        + "password=123123;";
		   	String insertString = "INSERT INTO Pessoa (Nome, Endereco, Cidade) VALUES (?, ?, ?)";
	        try (
	        		Connection con = DriverManager.getConnection(connectionUrl); 
	        		PreparedStatement stmt = con.prepareStatement(insertString);
	        	) {
	        	
	        	Pessoa p1 = new Pessoa("Pedro", "Rua Manaus", "Joinville");
	        	stmt.setString(1, p1.getNome());
	        	stmt.setString(2, p1.getEndereco()); 
	        	stmt.setString(3, p1.getCidade()); 
	        	stmt.executeUpdate(); 
	        	
	        	Pessoa p2 = new Pessoa("Jonas", "Rua Claudio", "Manaus");
	        
	          	stmt.setString(1, p2.getNome());
	        	stmt.setString(2, p2.getEndereco()); 
	        	stmt.setString(3, p2.getCidade()); 
	        	stmt.executeUpdate(); 
	        	
	        	Pessoa p3 = new Pessoa("Maicon", "Rua Padre", "Curitiba");
		        
	          	stmt.setString(1, p3.getNome());
	        	stmt.setString(2, p3.getEndereco()); 
	        	stmt.setString(3, p3.getCidade()); 
	        	stmt.executeUpdate(); 

	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }

	        String insertStringCar = "INSERT INTO Carro (Nome, Marca, ID_Pessoa) VALUES (?, ?, ?)";
	        try (
	        		Connection con = DriverManager.getConnection(connectionUrl); 
	        		PreparedStatement stmt = con.prepareStatement(insertStringCar);
	        	) {
	        	
	        	Carro c1 = new Carro("Fit", "Rua Honda", 1);
	        	stmt.setString(1, c1.getNome());
	        	stmt.setString(2, c1.getMarca()); 
	        	stmt.setInt(3, c1.getId_pessoa()); 
	        	stmt.executeUpdate(); 
	        	
	         	Carro c2 = new Carro("Spin", "Chevrolet", 1);
	        	stmt.setString(1, c2.getNome());
	        	stmt.setString(2, c2.getMarca()); 
	        	stmt.setInt(3, c2.getId_pessoa()); 
	        	stmt.executeUpdate();  
	        	
	          	Carro c3 = new Carro("Sandero", "Chevrolet", 2);
	        	stmt.setString(1, c3.getNome());
	        	stmt.setString(2, c3.getMarca()); 
	        	stmt.setInt(3, c3.getId_pessoa()); 
	        	stmt.executeUpdate();  

	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }

	        try (
	        		Connection con = DriverManager.getConnection(connectionUrl); 
	        		Statement stmt = con.createStatement();
	        	) {
	        	
	            String SQL = "select Pessoa.Nome as pessoaName, Pessoa.Cidade, Pessoa.Endereco, " + 
	            			 "Carro.Marca, Carro.Nome as carroName, Pessoa.ID_Pessoa " + 
	            			 "from Pessoa " + 
	            			 "inner join Carro " + 
	            			 "on Pessoa.ID_Pessoa = Carro.ID_Pessoa"; 
	            ResultSet rs = stmt.executeQuery(SQL);

	            while (rs.next()) {
	            	Pessoa p = new Pessoa();
	            	Carro c = new Carro();

	            	p.setNome(rs.getString("pessoaName"));
	            	p.setCidade(rs.getString("cidade"));
	            	p.setEndereco(rs.getString("endereco"));
	            	c.setNome(rs.getString("carroName"));
	            	c.setMarca(rs.getString("marca"));
	            	
	            	System.out.println(p + c.toString()); 
	            }
	        }
	        
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	 
		}

	}