package br.com.micron.lucascarvalho.tecnicosmicron.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco {

    //Nome do Banco
    private static final String NOME_BANCO = "tecnicos.db";
    // Versão do Banco
    private static final int VERSAO = 1;

    protected static class OpenHelper extends SQLiteOpenHelper {
        OpenHelper(Context context) {
            super(context, NOME_BANCO, null, VERSAO);
        }


        //Nome Tabela
        public static final String CLIENTE = "Cliente";
        //Atributos
        private static final String CLIENTE_ID = "_Id";
        public static final String CLIENTE_NOME = "Nome";

        public static final String TELEFONE = "Telefone";
        public static final String TELEFONE_IDCLIENTE = "IdCliente";
        public static final String TELEFONE_TELEFONE = "Telefone";
        public static final String TELEFONE_TIPO = "Tipo";

        public static final String ATENDIMENTO = "Atendimento";
        private static final String ATENDIMENTO_PROTOCOLO = "Protocolo";
        public static final String ATENDIMENTO_IDCLIENTE = "IdCliente";
        public static final String ATENDIMENTO_IDENDERECO = "IdEndereco";
        public static final String ATENDIMENTO_IDENDERECOMUDANCA = "IdEnderecoMudanca";
        public static final String ATENDIMENTO_SOLICITACAO = "Solicitacao";
        public static final String ATENDIMENTO_LOGIN = "Login";
        public static final String ATENDIMENTO_SENHA = "Senha";
        public static final String ATENDIMENTO_AGENDAMENTO = "Agendamento";
        public static final String ATENDIMENTO_SITUACAO = "Situacao";

        public static final String ENDERECO = "Endereco";
        private static final String ENDERECO_ID = "_Id";
        public static final String ENDERECO_IDCLIENTE = "IdCliente";
        public static final String ENDERECO_CEP = "CEP";
        public static final String ENDERECO_UF = "UF";
        public static final String ENDERECO_CIDADE = "Cidade";
        public static final String ENDERECO_BAIRRO = "Bairro";
        public static final String ENDERECO_ENDERECO = "Endereco";
        public static final String ENDERECO_NUMERO = "Numero";
        public static final String ENDERECO_COMPLEMENTO = "Complemento";
        public static final String ENDERECO_REFERENCIA = "Referencia";

        public static final String ACOMPANHAMENTO = "Acompanhamento";
        public static final String ACOMPANHAMENTO_PROTOCOLO = "Protocolo";
        public static final String ACOMPANHAMENTO_DATAHORA = "Datahora";
        public static final String ACOMPANHAMENTO_TIPO = "Tipo";
        public static final String ACOMPANHAMENTO_LATITUDE = "Latitude";
        public static final String ACOMPANHAMENTO_LONGITUDE = "Longitude";
        public static final String ACOMPANHAMENTO_LASTTIME = "Lasttime";

        public static final String COORDENADAS = "Coordenada";
        private static final String COORDENADAS_IDENDERECO = "IdEndereco";
        public static final String COORDENADAS_LATITUDE = "Latitude";
        public static final String COORDENADAS_LONGITUDE = "Longitude";
        public static final String COORDENADAS_LASTTIME = "LastTime";

        public static final String PARAMETROS = "Parametros";
        private static final String PARAMETROS_ID = "_Id";
        private static final String PARAMETROS_ATRIBUTO = "IdEndereco";
        public static final String PARAMETROS_INDICE = "Latitude";
        public static final String PARAMETROS_VALOR = "Longitude";

        public static final String MODELO = "Modelo";
        private static final String MODELO_ID = "_Id";
        public static final String MODELO_FABRICANTE = "Fabricante";
        public static final String MODELO_NOME = "Nome";

        public static final String FABRICANTE = "Fabricante";
        private static final String FABRICANTE_ID = "_Id";
        public static final String FABRICANTE_NOME = "Nome";

        public static final String FOTOS = "Fotos";
        private static final String FOTOS_ID = "_Id";
        public static final String FOTOS_PROTOCOLO = "Protocolo";
        public static final String FOTOS_CATEGORIA = "Categoria";
        public static final String FOTOS_FOTOS = "Foto";

        public static final String TAJETORIA = "Trajetoria";
        private static final String TAJETORIA_IDTECNICO = "_IdTecnico";
        private static final String TAJETORIA_DATAHORA = "DataHora";
        public static final String TAJETORIA_LATITUDE = "Latitude";
        public static final String TAJETORIA_LONGITUDE = "Longitude";
        public static final String TAJETORIA_LASTTIME = "Lasttime";

        @Override
        public void onCreate(SQLiteDatabase db) {
            String sqlCliente = "CREATE TABLE " + CLIENTE + "("
                    + CLIENTE_ID + " integer primary key,"
                    + CLIENTE_NOME + " text"
                    + ")";

            db.execSQL(sqlCliente);

            String sqlTelefone = "CREATE TABLE " + TELEFONE + "("
                    + TELEFONE_IDCLIENTE + " integer primary key,"
                    + TELEFONE_TELEFONE + " text,"
                    + TELEFONE_TIPO + " text"
                    + ")";

            db.execSQL(sqlTelefone);

            String sqlAtendimento = "CREATE TABLE " + ATENDIMENTO + "("
                    + ATENDIMENTO_PROTOCOLO + " text primary key,"
                    + ATENDIMENTO_IDCLIENTE + " integer,"
                    + ATENDIMENTO_IDENDERECO + "integer,"
                    + ATENDIMENTO_IDENDERECOMUDANCA + " integer,"
                    + ATENDIMENTO_SOLICITACAO + " text,"
                    + ATENDIMENTO_LOGIN + "text,"
                    + ATENDIMENTO_SENHA + " text,"
                    + ATENDIMENTO_AGENDAMENTO + " text,"
                    + ATENDIMENTO_SITUACAO + " text"
                    + ")";

            db.execSQL(sqlAtendimento);

            String sqlEndereco = "CREATE TABLE " + ENDERECO + "("
                    + ENDERECO_ID + " integer primary key,"
                    + ENDERECO_IDCLIENTE + " integer,"
                    + ENDERECO_CEP + "text,"
                    + ENDERECO_UF + " integer,"
                    + ENDERECO_CIDADE + " text,"
                    + ENDERECO_BAIRRO + "text,"
                    + ENDERECO_ENDERECO + "text,"
                    + ENDERECO_NUMERO + " text,"
                    + ENDERECO_COMPLEMENTO + " text,"
                    + ENDERECO_REFERENCIA + " text"
                    + ")";

            db.execSQL(sqlEndereco);

            String sqlAcompanhamento = "CREATE TABLE " + ACOMPANHAMENTO + "("
                    + ACOMPANHAMENTO_PROTOCOLO + " text,"
                    + ACOMPANHAMENTO_DATAHORA + " date,"
                    + ACOMPANHAMENTO_TIPO + "text,"
                    + ACOMPANHAMENTO_LATITUDE + " integer,"
                    + ACOMPANHAMENTO_LONGITUDE + " text,"
                    + ACOMPANHAMENTO_LASTTIME + "date"
                    + ")";

            db.execSQL(sqlAcompanhamento);

            String sqlCoordenadas = "CREATE TABLE " + COORDENADAS + "("
                    + COORDENADAS_IDENDERECO + " integer primary key,"
                    + COORDENADAS_LATITUDE + " text,"
                    + COORDENADAS_LONGITUDE + "text,"
                    + COORDENADAS_LASTTIME + " date"
                    + ")";

            db.execSQL(sqlCoordenadas);

            String sqlTrajetoria = "CREATE TABLE " + TAJETORIA + "("
                    + TAJETORIA_IDTECNICO + "integer primary key,"
                    + TAJETORIA_DATAHORA + " text,"
                    + TAJETORIA_LATITUDE + "text,"
                    + TAJETORIA_LONGITUDE + " text,"
                    + TAJETORIA_LASTTIME + " date"
                    + ")";

            db.execSQL(sqlTrajetoria);

            String sqlFotos = "CREATE TABLE " + FOTOS + "("
                    + FOTOS_ID + "integer primary key,"
                    + FOTOS_PROTOCOLO + " text,"
                    + FOTOS_CATEGORIA + "text,"
                    + FOTOS_FOTOS + " text"
                    + ")";

            db.execSQL(sqlFotos);

            String sqlFabricante = "CREATE TABLE " + FABRICANTE + "("
                    + FABRICANTE_ID + "integer primary key,"
                    + FABRICANTE_NOME + " text"
                    + ")";

            db.execSQL(sqlFabricante);

            String sqlModelo = "CREATE TABLE " + MODELO + "("
                    + MODELO_ID + "integer primary key,"
                    + MODELO_FABRICANTE + " text,"
                    + MODELO_NOME + " text"
                    + ")";

            db.execSQL(sqlModelo);

            String sqlParametros = "CREATE TABLE " + PARAMETROS + "("
                    + PARAMETROS_ID + "integer primary key,"
                    + PARAMETROS_ATRIBUTO + " text,"
                    + PARAMETROS_INDICE + " text,"
                    + PARAMETROS_VALOR + " text"
                    + ")";

            db.execSQL(sqlParametros);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + CLIENTE);
            db.execSQL("DROP TABLE IF EXISTS " + TELEFONE);
            db.execSQL("DROP TABLE IF EXISTS " + ATENDIMENTO);
            db.execSQL("DROP TABLE IF EXISTS " + ENDERECO);
            db.execSQL("DROP TABLE IF EXISTS " + ACOMPANHAMENTO);
            db.execSQL("DROP TABLE IF EXISTS " + COORDENADAS);
            db.execSQL("DROP TABLE IF EXISTS " + TAJETORIA);
            db.execSQL("DROP TABLE IF EXISTS " + FOTOS);
            db.execSQL("DROP TABLE IF EXISTS " + MODELO);
            db.execSQL("DROP TABLE IF EXISTS " + PARAMETROS);
        }
    }
}
