package h3;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import app.namso_gen.spacehowen.R;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EditText f4862f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public EditText f4863g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public EditText f4864h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Button f4865i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f4866j0;
    public Spinner k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Spinner f4867l0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Switch f4869n0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f4868m0 = new LinkedHashSet();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f4870o0 = "save_to_db_switch_state";

    public static String b0(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        StringBuilder sb2 = new StringBuilder();
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = lowerCase.charAt(i);
            if (Character.isDigit(cCharAt) || cCharAt == 'x') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_generate_cc, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        this.f4869n0 = (Switch) view.findViewById(R.id.saveToDbSwitch);
        this.f4862f0 = (EditText) view.findViewById(R.id.inputBinEditText);
        this.f4863g0 = (EditText) view.findViewById(R.id.inputCvvEditText);
        EditText editText = (EditText) view.findViewById(R.id.quantityEditText);
        editText.setText("5");
        this.f4864h0 = editText;
        this.f4865i0 = (Button) view.findViewById(R.id.generateCardsButton);
        this.f4866j0 = (EditText) view.findViewById(R.id.generatedCardsEditText);
        this.k0 = (Spinner) view.findViewById(R.id.monthSpinner);
        this.f4867l0 = (Spinner) view.findViewById(R.id.yearSpinner);
        EditText editText2 = this.f4866j0;
        if (editText2 == null) {
            jc.i.i("generatedCardsEditText");
            throw null;
        }
        editText2.setVisibility(8);
        SharedPreferences sharedPreferences = U().getSharedPreferences("AppPreferences", 0);
        boolean z4 = sharedPreferences.getBoolean(this.f4870o0, true);
        Switch r10 = this.f4869n0;
        if (r10 == null) {
            jc.i.i("saveToDbSwitch");
            throw null;
        }
        r10.setChecked(z4);
        Switch r11 = this.f4869n0;
        if (r11 == null) {
            jc.i.i("saveToDbSwitch");
            throw null;
        }
        r11.setOnCheckedChangeListener(new t(sharedPreferences, this, 0));
        Button button = this.f4865i0;
        if (button == null) {
            jc.i.i("generateCardsButton");
            throw null;
        }
        button.setOnClickListener(new com.google.android.material.datepicker.n(this, 5));
        EditText editText3 = this.f4862f0;
        if (editText3 != null) {
            editText3.setOnFocusChangeListener(new g9.a(this, 2));
        } else {
            jc.i.i("inputBinEditText");
            throw null;
        }
    }

    public final void c0(String str, String str2, String str3) {
        LinkedHashSet linkedHashSet = this.f4868m0;
        String str4 = str + '|' + str2 + '|' + str3;
        try {
            if (linkedHashSet.contains(str4)) {
                Log.d("SaveBinToApi", "El BIN ya está en proceso: " + str4);
                return;
            }
            linkedHashSet.add(str4);
            if (str.length() > 0) {
                Pattern patternCompile = Pattern.compile("^x+$");
                jc.i.d(patternCompile, "compile(...)");
                if (!patternCompile.matcher(str).matches()) {
                    if (jc.i.a(str2, "Random") || str2.length() <= 0 || jc.i.a(str3, "Random") || str3.length() <= 0) {
                        Log.d("SaveBinToApi", "Mes o año no válidos: Mes = " + str2 + ", Año = " + str3);
                        linkedHashSet.remove(str4);
                        return;
                    }
                    HashMap map = new HashMap();
                    map.put("bin_base", str);
                    map.put("month", str2);
                    map.put("year", str3);
                    com.bumptech.glide.d.v(U()).a(new r3.e(1, "https://api.spacehowen.com/bins-extras/save_bin.php", new JSONObject(map), new u(str4, this), new u(this, str4)));
                    return;
                }
            }
            Log.d("SaveBinToApi", "El BIN proporcionado no es válido: ".concat(str));
            linkedHashSet.remove(str4);
        } catch (Exception e) {
            Log.e("SaveBinToApi", "Error inesperado: " + e.getMessage());
            linkedHashSet.remove(str4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    public final void d0(String str) {
        String string;
        String strB0 = b0(str);
        int i = jd.l.i(strB0).f7236a;
        if (strB0.length() < i) {
            StringBuilder sbB = u.e.b(strB0);
            int length = i - strB0.length();
            if (length < 0) {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + length + '.').toString());
            }
            if (length != 0) {
                int i10 = 1;
                if (length != 1) {
                    int length2 = "x".length();
                    if (length2 == 0) {
                        string = "";
                    } else if (length2 != 1) {
                        StringBuilder sb2 = new StringBuilder("x".length() * length);
                        if (1 <= length) {
                            while (true) {
                                sb2.append((CharSequence) "x");
                                if (i10 == length) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        string = sb2.toString();
                        jc.i.b(string);
                    } else {
                        char cCharAt = "x".charAt(0);
                        char[] cArr = new char[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            cArr[i11] = cCharAt;
                        }
                        string = new String(cArr);
                    }
                } else {
                    string = "x".toString();
                }
            } else {
                string = "";
            }
            sbB.append(string);
            strB0 = sbB.toString();
        }
        EditText editText = this.f4862f0;
        if (editText == null) {
            jc.i.i("inputBinEditText");
            throw null;
        }
        editText.setText(strB0);
    }
}
