package h3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f4725f0 = "";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String[] f4726g0 = {"gmail.com", "outlok.com", "yahoo.com", "hotmail.com", "personalizado"};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Spinner f4727h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public EditText f4728i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f4729j0;
    public EditText k0;

    public static ArrayList b0(String str) {
        if (str.length() == 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        int length = str.length();
        for (int i = 1; i < length; i++) {
            int i10 = 0;
            String strSubstring = str.substring(0, i);
            jc.i.d(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(i);
            jc.i.d(strSubstring2, "substring(...)");
            ArrayList arrayListB0 = b0(strSubstring2);
            int size = arrayListB0.size();
            while (i10 < size) {
                Object obj = arrayListB0.get(i10);
                i10++;
                arrayList2.add(strSubstring + '.' + ((String) obj));
            }
        }
        return arrayList2;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mail_with_points, viewGroup, false);
        Spinner spinner = (Spinner) viewInflate.findViewById(R.id.spinner);
        this.f4727h0 = spinner;
        if (spinner == null) {
            jc.i.i("spinner");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(U(), android.R.layout.simple_spinner_item, this.f4726g0));
        Spinner spinner2 = this.f4727h0;
        if (spinner2 == null) {
            jc.i.i("spinner");
            throw null;
        }
        spinner2.setSelection(0);
        EditText editText = (EditText) viewInflate.findViewById(R.id.personalizadoText);
        this.f4728i0 = editText;
        if (editText == null) {
            jc.i.i("personalizado");
            throw null;
        }
        editText.setVisibility(8);
        EditText editText2 = (EditText) viewInflate.findViewById(R.id.viewText);
        this.f4729j0 = editText2;
        if (editText2 == null) {
            jc.i.i("visualizador");
            throw null;
        }
        editText2.setSingleLine(false);
        EditText editText3 = this.f4729j0;
        if (editText3 == null) {
            jc.i.i("visualizador");
            throw null;
        }
        editText3.setVisibility(8);
        this.k0 = (EditText) viewInflate.findViewById(R.id.editText);
        Button button = (Button) viewInflate.findViewById(R.id.btn_gen_mails_points);
        if (button == null) {
            jc.i.i("generateButton");
            throw null;
        }
        button.setOnClickListener(new com.google.android.material.datepicker.n(this, 8));
        Spinner spinner3 = this.f4727h0;
        if (spinner3 != null) {
            spinner3.setOnItemSelectedListener(new b0(this, 1));
            return viewInflate;
        }
        jc.i.i("spinner");
        throw null;
    }
}
