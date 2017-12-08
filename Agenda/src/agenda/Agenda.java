package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Agenda {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static ResultSet hs;
    public static ResultSet is;
    public static ResultSet ra;
    public static ResultSet rb;
    public static String sql;

    public static void main(String[] args) throws SQLException, ParseException {

        //Tabela agenda 
        int id_agenda;

        //Tabela pessoa
        int id_pessoa;
        String nome;
        String sobrenome;
        String dt_nascimento;

        //Tabela telefone
        int id_telefone;
        int tell;
        int ddd;
        int cod_operadora;

        //Tabela endereco
        int id_endereco;
        String endereco;
        String logradouro;
        int cep;

        //Tabela email
        int id_email;
        String email;

        Scanner in = new Scanner(System.in);

        int opcao = 0;
        String continuar = "";

        Scanner entrada = new Scanner(System.in);

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

        do {

            System.out.println("Escolha uma opcao: 1-Incluir  2-Listagem de campos 3-Deletar um campo por id 4-Alterar um campo 5-Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha uma das opcoes: 1-tabela agenda 2-tabela pessoa 3-tabela telefone 4-tabela endereco 5-tabela email");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    // Codigo para Incluir
                    switch (opcao) {

                        case 1:

                            do {
                                System.out.println("Digite o id");
                                id_agenda = Integer.parseInt(in.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "INSERT INTO agenda (id_agenda) VALUES (?)";

                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_agenda);

                                ps.execute();
                                ps.close();

                                System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 2:

                            do {
                                System.out.println("Digite o id");
                                id_pessoa = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o Nome");
                                nome = in.nextLine();

                                System.out.println("Digite o Sobrenome");
                                sobrenome = in.nextLine();

                                System.out.println("Digite a data de nascimento no formato aaaa/mm/dd");
                                dt_nascimento = entrada.nextLine();
                                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                                Date dt = df.parse(dt_nascimento);

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "INSERT INTO pessoa (id_pessoa, nome, sobrenome, dt_nascimento) VALUES (?, ?, ?, ?)";

                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_pessoa);
                                ps.setString(2, nome);
                                ps.setString(3, sobrenome);
                                ps.setString(4, dt_nascimento);

                                ps.execute();
                                ps.close();

                                System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 3:

                            do {
                                System.out.println("Digite o id");
                                id_telefone = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o Telefone");
                                tell = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o DDD");
                                ddd = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o Codigo da operadora");
                                cod_operadora = Integer.parseInt(in.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "INSERT INTO telefone (id_telefone, tell, ddd, cod_operadora) VALUES (?, ?, ?, ?)";

                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_telefone);
                                ps.setInt(2, tell);
                                ps.setInt(3, ddd);
                                ps.setInt(4, cod_operadora);

                                ps.execute();
                                ps.close();

                                System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 4:

                            do {
                                System.out.println("Digite o  id");
                                id_endereco = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o endereco");
                                endereco = in.nextLine();

                                System.out.println("Digite o Logradouro");
                                logradouro = in.nextLine();

                                System.out.println("Digite o CEP");
                                cep = Integer.parseInt(in.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "INSERT INTO endereco (id_endereco, endereco, logradouro, cep) VALUES (?, ?, ?, ?)";

                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_endereco);
                                ps.setString(2, endereco);
                                ps.setString(3, logradouro);
                                ps.setInt(4, cep);

                                ps.execute();
                                ps.close();

                                System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 5:

                            do {
                                System.out.println("Digite o id");
                                id_email = Integer.parseInt(in.nextLine());

                                System.out.println("Digite o email");
                                email = in.nextLine();

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "INSERT INTO email (id_email, email) VALUES (?, ?)";

                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_email);
                                ps.setString(2, email);

                                ps.execute();
                                ps.close();

                                System.out.print("Deseja continuar o cadastramento? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        default:

                            // Opção Invalida!
                            System.out.println("Opção Inválida! Tente novamente.");
                            break;
                    }
                    break;
                case 2:

                    System.out.println("Escolha uma das opcoes: 1-Listar tabela agenda 2-Listar tabela pessoa 3-Listar tabela telefone 4-Listar tabela endereco 5-listar tabela email");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    switch (opcao) {

                        case 1:

                            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                            sql = "SELECT * FROM agenda ORDER BY id_agenda";
                            ps = conexao.prepareStatement(sql);
                            ResultSet rs = ps.executeQuery();

                            while (rs.next()) {
                                System.out.println("Id_agenda:" + rs.getInt("id_agenda"));

                                System.out.println("");
                            }
                            System.out.println("Programa Finalizado.");
                            return;

                        case 2:
                            System.out.println("Escolha uma das opcoes: 1-Listar por ordem alfabetica crescente 2-Listar por ordem alfabetica decrescente");
                            opcao = entrada.nextInt();
                            entrada.nextLine();

                            switch (opcao) {

                                case 1:

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "SELECT * FROM pessoa ORDER BY nome ASC";
                                    ps = conexao.prepareStatement(sql);
                                    ResultSet hs = ps.executeQuery();

                                    while (hs.next()) {
                                        System.out.println("id_pessoa:" + hs.getInt("id_pessoa"));
                                        System.out.println("Nome:" + hs.getString("nome"));
                                        System.out.println("Sobrenome:" + hs.getString("sobrenome"));
                                        System.out.println("Data de Nascimento:" + hs.getString("dt_nascimento"));
                                        System.out.println("");
                                    }
                                    System.out.println("Programa Finalizado.");
                                    return;

                                case 2:

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "SELECT * FROM pessoa ORDER BY nome DESC";
                                    ps = conexao.prepareStatement(sql);
                                    ResultSet is = ps.executeQuery();

                                    while (is.next()) {
                                        System.out.println("id_pessoa:" + is.getInt("id_pessoa"));
                                        System.out.println("Nome:" + is.getString("nome"));
                                        System.out.println("Sobrenome:" + is.getString("sobrenome"));
                                        System.out.println("Data de Nascimento:" + is.getString("dt_nascimento"));
                                        System.out.println("");
                                    }
                                    System.out.println("Programa Finalizado.");
                                    return;
                            }

                        case 3:
                            sql = "SELECT * FROM telefone ORDER BY id_telefone";
                            ps = conexao.prepareStatement(sql);
                            ResultSet is = ps.executeQuery();

                            while (is.next()) {
                                System.out.println("id_Telefone:" + is.getInt("id_telefone"));
                                System.out.println("Tell:" + is.getInt("tell"));
                                System.out.println("DDD:" + is.getInt("ddd"));
                                System.out.println("Codigo da Operadora:" + is.getInt("cod_operadora"));
                                System.out.println("");
                            }
                            System.out.println("Programa Finalizado.");
                            return;

                        case 4:
                            sql = "SELECT * FROM endereco ORDER BY id_endereco";
                            ps = conexao.prepareStatement(sql);
                            ResultSet ra = ps.executeQuery();

                            while (ra.next()) {
                                System.out.println("id_endereco:" + ra.getInt("id_endereco"));
                                System.out.println("endereco" + ra.getString("endereco"));
                                System.out.println("Logradouro:" + ra.getString("logradouro"));
                                System.out.println("CEP:" + ra.getInt("cep"));
                                System.out.println("");
                            }
                            System.out.println("Programa Finalizado.");
                            return;

                        case 5:
                            sql = "SELECT * FROM email ORDER BY id_email";
                            ps = conexao.prepareStatement(sql);
                            ResultSet rb = ps.executeQuery();

                            while (rb.next()) {
                                System.out.println("id_email:" + rb.getInt("id_email"));
                                System.out.println("Email:" + rb.getString("Email"));
                                System.out.println("");
                            }
                            System.out.println("Programa Finalizado.");
                            return;

                        default:

                            // Opção Invalida!
                            System.out.println("Opção Inválida! Tente novamente.");
                            break;
                    }
                    break;

                case 3:

                    System.out.println("Escolha uma tabela para apagar dados: 1-tabela agenda 2-tabela pessoa 3-tabela telefone 4-tabela endereco 5-tabela email");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    switch (opcao) {

                        case 1:

                            do {

                                System.out.println("Digite o Id para apagar");
                                id_agenda = Integer.parseInt(entrada.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "DELETE FROM agenda WHERE id_agenda = ?";
                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_agenda);

                                ps.execute();
                                ps.close();
                                System.out.print("Deseja alterar algum outro campo?? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 2:
                            do {
                                System.out.println("Digite o Id para apagar");
                                id_pessoa = Integer.parseInt(entrada.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "DELETE FROM pessoa WHERE id_pessoa = ?";
                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_pessoa);

                                ps.execute();
                                ps.close();
                                System.out.print("Deseja alterar algum outro campo?? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 3:
                            do {
                                System.out.println("Digite o Id para apagar");
                                id_telefone = Integer.parseInt(entrada.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "DELETE FROM telefone WHERE id_telefone = ?";
                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_telefone);

                                ps.execute();
                                ps.close();
                                System.out.print("Deseja alterar algum outro campo?? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 4:
                            do {
                                System.out.println("Digite o Id para apagar");
                                id_endereco = Integer.parseInt(entrada.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "DELETE FROM endereco WHERE id_endereco = ?";
                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_endereco);

                                ps.execute();
                                ps.close();
                                System.out.print("Deseja alterar algum outro campo?? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        case 5:
                            do {
                                System.out.println("Digite o Id para apagar");
                                id_email = Integer.parseInt(entrada.nextLine());

                                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                sql = "DELETE FROM email WHERE id_email = ?";
                                ps = conexao.prepareStatement(sql);

                                ps.setInt(1, id_email);

                                ps.execute();
                                ps.close();
                                System.out.print("Deseja alterar algum outro campo?? 1-Sim  2-Não ");
                                continuar = entrada.nextLine();

                            } while (continuar.equals("1"));
                            break;

                        default:

                            // Opção Invalida!
                            System.out.println("Opção Inválida! Tente novamente.");
                            break;

                    }

                    break;
                case 4:

                    System.out.println("Escolha uma tabela para alterar: 1-pessoa 2-telefone 3-endereco 4-email");
                    opcao = entrada.nextInt();
                    entrada.nextLine();

                    switch (opcao) {

                        case 1:

                            System.out.println("1-Atualizar nome 2-Atualizar sobrenome 3-Atualizar dt_nascimento");
                            opcao = entrada.nextInt();
                            entrada.nextLine();
                            switch (opcao) {

                                case 1:

                                    System.out.println("Digite o novo nome");
                                    nome = entrada.nextLine();

                                    System.out.println("Digite o id da pessoa  que ira mudar");
                                    id_pessoa = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE pessoa SET nome = ? where id_pessoa = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setString(1, nome);
                                    ps.setInt(2, id_pessoa);

                                    ps.execute();
                                    ps.close();
                                    return;

                                case 2:

                                    System.out.println("Digite o novo sobrenome");
                                    sobrenome = entrada.nextLine();

                                    System.out.println("Digite o id da pessoa  que ira mudar");
                                    id_pessoa = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE pessoa SET sobrenome = ? where id_pessoa = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setString(1, sobrenome);
                                    ps.setInt(2, id_pessoa);

                                    ps.execute();
                                    ps.close();
                                    return;

                                case 3:

                                    System.out.println("Digite o nova data de nascimento");
                                    dt_nascimento = entrada.nextLine();

                                    System.out.println("Digite o id da pessoa  que ira mudar");
                                    id_pessoa = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE pessoa SET dt_nascimento = ? where id_pessoa = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setString(1, dt_nascimento);
                                    ps.setInt(2, id_pessoa);

                                    ps.execute();
                                    ps.close();
                                    return;

                                default:

                                    // Opção Invalida!
                                    System.out.println("Opção Inválida! Tente novamente.");
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("1-Atualizar telefone 2-Atualizar ddd 3-Atualizar codigo da operadora");
                            opcao = entrada.nextInt();
                            entrada.nextLine();

                            switch (opcao) {

                                case 1:
                                    System.out.println("Digite o novo telefone");
                                    tell = Integer.parseInt(entrada.nextLine());

                                    System.out.println("Digite o id do telefone  que ira mudar");
                                    id_telefone = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE telefone SET tell = ? where id_telefone = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setInt(1, tell);
                                    ps.setInt(2, id_telefone);

                                    ps.execute();
                                    ps.close();
                                    return;
                                case 2:
                                    System.out.println("Digite o novo ddd");
                                    ddd = Integer.parseInt(entrada.nextLine());

                                    System.out.println("Digite o id do telefone  que ira mudar");
                                    id_telefone = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE telefone SET ddd = ? where id_telefone = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setInt(1, ddd);
                                    ps.setInt(2, id_telefone);

                                    ps.execute();
                                    ps.close();
                                    return;
                                case 3:
                                    System.out.println("Digite a nova operadora");
                                    cod_operadora = Integer.parseInt(entrada.nextLine());

                                    System.out.println("Digite o id do telefone  que ira mudar");
                                    id_telefone = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE telefone SET cod_operadora = ? where id_telefone = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setInt(1, cod_operadora);
                                    ps.setInt(2, id_telefone);

                                    ps.execute();
                                    ps.close();
                                    return;

                                default:

                                    // Opção Invalida!
                                    System.out.println("Opção Inválida! Tente novamente.");
                                    break;
                            }
                            break;
                        case 3:

                            System.out.println("1-Atualizar endereco 2-Atualizar logradouro 3-Atualizar cep");
                            opcao = entrada.nextInt();
                            entrada.nextLine();

                            switch (opcao) {

                                case 1:

                                    System.out.println("Digite o novo endereco");
                                    endereco = entrada.nextLine();

                                    System.out.println("Digite o id do endereco  que ira mudar");
                                    id_endereco = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE endereco SET endereco = ? where id_endereco = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setString(1, endereco);
                                    ps.setInt(2, id_endereco);

                                    ps.execute();
                                    ps.close();
                                    return;

                                case 2:

                                    System.out.println("Digite o novo logradouro");
                                    logradouro = entrada.nextLine();

                                    System.out.println("Digite o id do endereco  que ira mudar");
                                    id_endereco = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE endereco SET logradouro = ? where id_endereco = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setString(1, logradouro);
                                    ps.setInt(2, id_endereco);

                                    ps.execute();
                                    ps.close();
                                    return;

                                case 3:

                                    System.out.println("Digite o novo cep");
                                    cep = Integer.parseInt(entrada.nextLine());

                                    System.out.println("Digite o id do endereco  que ira mudar");
                                    id_endereco = Integer.parseInt(entrada.nextLine());

                                    conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                                    sql = "UPDATE endereco SET cep = ? where id_endereco = ?";
                                    ps = conexao.prepareStatement(sql);

                                    ps.setInt(1, cep);
                                    ps.setInt(2, id_endereco);

                                    ps.execute();
                                    ps.close();

                                    return;

                                default:

                                    // Opção Invalida!
                                    System.out.println("Opção Inválida! Tente novamente.");
                                    break;

                            }
                            break;
                        case 4:

                            System.out.println("Digite o novo email");
                            email = entrada.nextLine();

                            System.out.println("Digite o id do email  que ira mudar");
                            id_email = Integer.parseInt(entrada.nextLine());

                            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", usuario, senha);

                            sql = "UPDATE email SET email = ? where id_email = ?";
                            ps = conexao.prepareStatement(sql);

                            ps.setString(1, email);
                            ps.setInt(2, id_email);

                            ps.execute();
                            ps.close();
                            return;

                    }

                case 5:
                    // Codigo para Sair
                    conexao.close();
                    System.out.println("Programa Finalizado.");
                    return;

                default:

                    // Opcao Invalida!
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;

            }
        } while (opcao != 5);

    }

}