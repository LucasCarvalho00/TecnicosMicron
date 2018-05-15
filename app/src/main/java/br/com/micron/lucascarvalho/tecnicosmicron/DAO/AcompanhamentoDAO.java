package br.com.micron.lucascarvalho.tecnicosmicron.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

public class AcompanhamentoDAO extends CriaBanco {

    // Tabela utilizada no SQLite
    private static final String TABLE_NAME = "";
    private Context context;
    private SQLiteStatement insertStmt;
    private SQLiteDatabase db;

    public AcompanhamentoDAO(Context context){
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        this.db = openHelper.getWritableDatabase();
    }
}
