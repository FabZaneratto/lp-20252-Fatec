package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    //função para inserir um aluno no banco de dados

    public void inserir(String nome, String cpf) {

        String sql = "INSERT INTO aluno (nome, cpf) VALUES (?,?)";

        try { // tenta inserir
            //conecta no banco de dados
            Connection conexao = ConnectionFactory.getConnection();

            // prepara para inserir
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //define os valores de nome e cpf
            stmt.setString(1, nome);
            stmt.setString(2, cpf);

            //executa a inserção no banco de dados
            stmt.executeUpdate();
            System.out.println("Aluno adicionado com sucesso!");


        } catch (SQLException e) {
            System.out.println("Erro ao inserir aluno " + e.getMessage());
        }

    }
    public List<String> listar(){
        //Cria a lista de alunos
        List<String> alunos = new ArrayList<>();

        //Cria o SQL
        String sql = "SELECT * FROM aluno order by id";

        try{ // vamos tentar selecionar
            //abre a conexão
            Connection conexao = ConnectionFactory.getConnection();
            //cria objeto que vai realmente consultar
            Statement stmt = conexao.createStatement();
            // executa a consulta e atribui resultado para objeto rs
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {//gera cada aluno
                //adiciona id e nome na lista de alunos
                alunos.add(rs.getInt("id") + " - " + rs.getString("nome") + " : " + rs.getLong("cpf"));

            }
        }
        catch (SQLException e){
            System.out.println("Erro ao listar alunos !" + e.getMessage());
        }
        return alunos;
    }
    //Remoção do Bancos de dados
    public void remover(int id){
        String sql = "DELETE FROM aluno  WHERE id = ?";
        //tenta remover:
        try{
            //obtém a conexão com o banco de dados
            Connection conexao = ConnectionFactory.getConnection();
            //cria uma instrução de banco de dados
            PreparedStatement instrucao = conexao.prepareStatement(sql);
            //define o valor do id
            instrucao.setInt(1, id);
            //executa a remoção
            int qtdLinhasAfetadas = instrucao.executeUpdate();
            //testa a qtd de linhas afetadas
            if (qtdLinhasAfetadas > 0){
                System.out.println("Aluno removido com sucesso!");
            }
            else {
                System.out.println("Aluno não encontrado!");
            }
        }
        catch (SQLException e){
            System.out.println("Erro ao remover aluno! " + e.getMessage());
        }
    }
    //funçaõ para atualizar um aluno no banco de dados
    public void atualizar (int id, String novoNome, String novoCpf){
        //monta o sql
        String sql = "UPDATE aluno SET nome = ? , cpf = ? WHERE id = ?";
        //tenta atualizar o aluno
        try{
            //abre a conexão com o banco
            Connection conexao = ConnectionFactory.getConnection();
            //cria uma instrução (Statement)
            PreparedStatement stmt = conexao.prepareStatement(sql);
            //atribuir os valores (?)
            stmt.setString(1,novoNome);
            stmt.setString(2, novoCpf);
            stmt.setInt(3, id);
            //executa o comando de atualização
            int nroLinhasAfetadas = stmt.executeUpdate();
            if (nroLinhasAfetadas > 0 ){
                System.out.println("Aluno atualizado com Sucesso!");
            }
            else {
                System.out.println("Aluno não encontrado");
            }
        }
        catch (SQLException e){
            System.out.println("Erro ao atualizar aluno " + e.getMessage());
        }
    }
}
