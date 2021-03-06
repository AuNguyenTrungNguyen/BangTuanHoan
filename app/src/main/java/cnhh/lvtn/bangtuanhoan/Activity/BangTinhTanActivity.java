package cnhh.lvtn.bangtuanhoan.Activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cnhh.lvtn.bangtuanhoan.Model.Anion;
import cnhh.lvtn.bangtuanhoan.Model.BangTinhTan;
import cnhh.lvtn.bangtuanhoan.Model.Cation;
import cnhh.lvtn.bangtuanhoan.R;

public class BangTinhTanActivity extends AppCompatActivity {

    private List<Anion> mAnionList;
    private List<Cation> mCationList;
    private List<BangTinhTan> mBangTinhTanList;

    private TableLayout mTlBangTinhTan;
    private TableLayout mTlAnion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bang_tinh_tan);

        init();

        addAnion();

        addCation();

        addSolubility();

        createTableDynamic();

    }

    private void init() {
        mAnionList = new ArrayList<>();
        mCationList = new ArrayList<>();
        mBangTinhTanList = new ArrayList<>();

        mTlBangTinhTan = findViewById(R.id.tl_bang_tinh_tan);
        mTlAnion = findViewById(R.id.tl_anion);
    }

    private void addAnion() {
        Anion anion = new Anion(1, "Cl", "-");
        mAnionList.add(anion);

        anion = new Anion(2, "Br", "-");
        mAnionList.add(anion);

        anion = new Anion(3, "I", "-");
        mAnionList.add(anion);

        anion = new Anion(4, "NO3", "-");
        mAnionList.add(anion);

        anion = new Anion(5, "CH3COO", "-");
        mAnionList.add(anion);

        anion = new Anion(6, "S", "2-");
        mAnionList.add(anion);

        anion = new Anion(7, "SO3", "2-");
        mAnionList.add(anion);

        anion = new Anion(8, "SO4", "2-");
        mAnionList.add(anion);

        anion = new Anion(9, "CO3", "2-");
        mAnionList.add(anion);

        anion = new Anion(10, "SiO3", "2-");
        mAnionList.add(anion);

        anion = new Anion(11, "CrO4", "2-");
        mAnionList.add(anion);

        anion = new Anion(12, "PO4", "3-");
        mAnionList.add(anion);

        anion = new Anion(13, "OH", "-");
        mAnionList.add(anion);

    }

    private void addCation() {
        Cation cation = new Cation(1, "Li", "+");
        mCationList.add(cation);

        cation = new Cation(2, "Na", "+");
        mCationList.add(cation);

        cation = new Cation(3, "K", "+");
        mCationList.add(cation);

        cation = new Cation(4, "NH4", "+");
        mCationList.add(cation);

        cation = new Cation(5, "Cu", "+");
        mCationList.add(cation);

        cation = new Cation(6, "Ag", "+");
        mCationList.add(cation);

        cation = new Cation(7, "Mg", "2+");
        mCationList.add(cation);

        cation = new Cation(8, "Ca", "2+");
        mCationList.add(cation);

        cation = new Cation(9, "Sr", "2+");
        mCationList.add(cation);

        cation = new Cation(10, "Ba", "2+");
        mCationList.add(cation);

        cation = new Cation(11, "Zn", "2+");
        mCationList.add(cation);

        cation = new Cation(12, "Hg", "2+");
        mCationList.add(cation);

        cation = new Cation(13, "Al", "3+");
        mCationList.add(cation);

        cation = new Cation(14, "Sn", "2+");
        mCationList.add(cation);

        cation = new Cation(15, "Pb", "2+");
        mCationList.add(cation);

        cation = new Cation(16, "Bi", "3+");
        mCationList.add(cation);

        cation = new Cation(17, "Cr", "3+");
        mCationList.add(cation);

        cation = new Cation(18, "Mn", "2+");
        mCationList.add(cation);

        cation = new Cation(19, "Fe", "3+");
        mCationList.add(cation);

        cation = new Cation(20, "Fe", "2+");
        mCationList.add(cation);
    }

    private void addSolubility() {
        BangTinhTan bangTinhTan;

        bangTinhTan = new BangTinhTan(1, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 5, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 12, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 14, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 15, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 18, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 19, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(1, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        //-----

        bangTinhTan = new BangTinhTan(2, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 5, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 12, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 14, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 15, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 18, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 19, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(2, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(3, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 5, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 12, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 14, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 19, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(3, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(4, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 5, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 6, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 12, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 15, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 16, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 18, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 19, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(4, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(5, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 5, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 6, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 12, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 15, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 17, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 18, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 19, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(5, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        ///-moi add
        bangTinhTan = new BangTinhTan(6, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 5, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 7, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 8, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 9, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 12, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 13, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 14, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 17, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 19, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(6, 20, "K");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(7, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 5, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 7, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 8, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 9, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 12, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 13, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 17, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 19, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(7, 20, "K");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(8, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 5, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 6, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 8, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 9, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 11, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 12, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 13, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 14, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 18, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 19, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(8, 20, "T");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(9, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 5, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 7, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 8, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 9, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 12, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 13, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 17, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 19, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(9, 20, "K");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(10, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 4, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 5, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 6, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 7, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 8, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 9, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 12, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 13, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 16, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 17, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 19, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(10, 20, "K");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(11, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 5, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 7, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 8, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 9, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 12, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 13, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 14, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 17, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 19, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(11, 20, "-");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(12, 1, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 5, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 6, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 7, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 8, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 9, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 10, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 12, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 13, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 14, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 17, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 19, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(12, 20, "K");
        mBangTinhTanList.add(bangTinhTan);

        //--

        bangTinhTan = new BangTinhTan(13, 1, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 2, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 3, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 4, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 5, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 6, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 7, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 8, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 9, "I");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 10, "T");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 11, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 12, "-");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 13, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 14, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 15, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 16, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 17, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 18, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 19, "K");
        mBangTinhTanList.add(bangTinhTan);

        bangTinhTan = new BangTinhTan(13, 20, "K");
        mBangTinhTanList.add(bangTinhTan);
    }

    private String showIon(String ten, String hoaTri) {

        String result = "";

        for (int i = 0; i < ten.length(); i++) {
            char c = ten.charAt(i);

            if (c >= '0' && c <= '9') {
                result += "<small><sub>" + c + "</sub></small>";
            } else {
                result += c;
            }
        }

        String strHoaTri = hoaTri.substring(hoaTri.length() - 1, hoaTri.length());

        if (strHoaTri.equals("+")) {
            hoaTri = " <font color='red'>" + hoaTri + "</font>";
        } else {
            hoaTri = " <font color='blue'>" + hoaTri + "</font>";
        }

        String temp = result + "<small><sup>" + hoaTri + "</sup></small>";
        result = "<b>" + temp + "</b>";

        return result;
    }

    private void createTableDynamic() {
        int lengthAnion = mAnionList.size();
        int lengthCation = mCationList.size();

        //Create header Cation
        TableRow rowHeader = new TableRow(this);
        TextView tvNull = new TextView(getApplicationContext());
        tvNull.setGravity(Gravity.CENTER);
        tvNull.setBackgroundResource(R.drawable.background_item_empty_bang_tinh_tan);
        rowHeader.addView(tvNull, 100, 55);
        mTlAnion.addView(rowHeader);

        //Create header anion
        for (Anion anion : mAnionList) {
            TextView tvHeader = new TextView(this);
            rowHeader = new TableRow(this);
            tvHeader.setText(Html.fromHtml(showIon(anion.getTenAnion(), anion.getHoaTriAnion())));
            tvHeader.setGravity(Gravity.CENTER);
            tvHeader.setBackgroundResource(R.drawable.background_item_header_anion_bang_tinh_tan);
            rowHeader.addView(tvHeader, 100, 55);
            mTlAnion.addView(rowHeader);
        }

        //Create header cation
        rowHeader = new TableRow(this);
        for (Cation cation : mCationList) {
            TextView tvHeader = new TextView(this);
            tvHeader.setText(Html.fromHtml(showIon(cation.getTenCation(), cation.getHoaTriCation())));
            tvHeader.setGravity(Gravity.CENTER);
            tvHeader.setBackgroundResource(R.drawable.background_item_header_cation_bang_tinh_tan);
            rowHeader.addView(tvHeader, 100, 55);
        }
        mTlBangTinhTan.addView(rowHeader);

        //Add item
        for (int i = 1; i <= lengthAnion; i++) {
            TableRow row = new TableRow(this);

            for (int j = 1; j <= lengthCation; j++) {
                TextView tvTinhTan = new TextView(this);
                final String tinhTan = getTinhTan(i, j);

                Log.i("ANTN", "tinhTan: " + tinhTan);

                if (!tinhTan.equals("")) {
                    setItemValue(tinhTan,tvTinhTan);
                    tvTinhTan.setBackgroundResource(R.drawable.background_item_bang_tinh_tan);
                }
                row.addView(tvTinhTan, 100, 55);
            }
            mTlBangTinhTan.addView(row);
        }
    }

    private String getTinhTan(int anion, int cation) {
        String result = "";

        for (int i = 0; i < mBangTinhTanList.size(); i++) {
            BangTinhTan bangTinhTan = mBangTinhTanList.get(i);
            if (bangTinhTan.getAnion() == anion && bangTinhTan.getCation() == cation) {
                return bangTinhTan.getTinhTan();
            }
        }
        return result;
    }

    private void setItemValue(String text, TextView tvTinhTan){
        tvTinhTan.setText(text);
        tvTinhTan.setGravity(Gravity.CENTER);
        tvTinhTan.setTypeface(tvTinhTan.getTypeface(), Typeface.BOLD);
        switch (text){
            case "T":
                tvTinhTan.setTextColor(Color.BLUE);
                break;
            case "K":
                tvTinhTan.setTextColor(Color.RED);
                break;
            case "I":
                break;
            case "-":
                tvTinhTan.setTextColor(Color.GREEN);
                break;
        }
    }

}
