package com.google.android.material.datepicker;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.SettingsActivity;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import h3.a2;
import h3.f0;
import h3.g0;
import h3.h2;
import h3.i1;
import h3.i2;
import h3.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2444b;

    public /* synthetic */ n(Object obj, int i) {
        this.f2443a = i;
        this.f2444b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int length;
        MainActivity mainActivity;
        int i;
        String string;
        int i10;
        String string2;
        int i11;
        MainActivity mainActivity2;
        int i12 = this.f2443a;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.f2444b;
        switch (i12) {
            case 0:
                ((p) obj).f0();
                throw null;
            case 1:
                g9.d dVar = (g9.d) obj;
                EditText editText = dVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.p();
                return;
            case 2:
                ((g9.l) obj).t();
                return;
            case 3:
                g9.x xVar = (g9.x) obj;
                EditText editText2 = xVar.f4413f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f4413f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f4413f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f4413f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f4413f.setSelection(selectionEnd);
                }
                xVar.p();
                return;
            case 4:
                h3.b bVar = (h3.b) obj;
                EditText editText4 = bVar.f4621f0;
                if (editText4 == null) {
                    jc.i.i("binEditText");
                    throw null;
                }
                String string3 = editText4.getText().toString();
                if (string3.length() <= 0 || 6 > (length = string3.length()) || length >= 9) {
                    Toast.makeText(bVar.U(), bVar.v(R.string.error_invalid_bin), 0).show();
                    return;
                }
                r3.e eVar = new r3.e(0, "https://bins.antipublic.cc/bins/".concat(string3), null, new h3.a(bVar), new h3.a(bVar));
                fa.w wVar = bVar.f4625j0;
                if (wVar == null) {
                    jc.i.i("requestQueue");
                    throw null;
                }
                wVar.a(eVar);
                ProgressBar progressBar = bVar.f4624i0;
                if (progressBar == null) {
                    jc.i.i("progressBar");
                    throw null;
                }
                progressBar.setVisibility(0);
                androidx.fragment.app.w wVarT = bVar.T();
                MainActivity mainActivity3 = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                if (mainActivity3 != null) {
                    mainActivity3.z();
                    return;
                }
                return;
            case 5:
                h3.v vVar = (h3.v) obj;
                EditText editText5 = vVar.f4862f0;
                if (editText5 == null) {
                    jc.i.i("inputBinEditText");
                    throw null;
                }
                vVar.d0(editText5.getText().toString());
                EditText editText6 = vVar.f4862f0;
                if (editText6 == null) {
                    jc.i.i("inputBinEditText");
                    throw null;
                }
                String strB0 = h3.v.b0(editText6.getText().toString());
                EditText editText7 = vVar.f4863g0;
                if (editText7 == null) {
                    jc.i.i("inputCvvEditText");
                    throw null;
                }
                String string4 = editText7.getText().toString();
                Spinner spinner = vVar.k0;
                if (spinner == null) {
                    jc.i.i("monthSpinner");
                    throw null;
                }
                String string5 = spinner.getSelectedItem().toString();
                Spinner spinner2 = vVar.f4867l0;
                if (spinner2 == null) {
                    jc.i.i("yearSpinner");
                    throw null;
                }
                String string6 = spinner2.getSelectedItem().toString();
                EditText editText8 = vVar.f4864h0;
                if (editText8 == null) {
                    jc.i.i("quantityEditText");
                    throw null;
                }
                Integer numY = pc.n.Y(editText8.getText().toString());
                int iIntValue = numY != null ? numY.intValue() : 0;
                String str = jc.i.a(string5, "Random") ? "" : string5;
                String str2 = jc.i.a(string6, "Random") ? "" : string6;
                if (iIntValue <= 0) {
                    Toast.makeText(vVar.U(), R.string.error_invalid_quantity, 0).show();
                    mainActivity = null;
                } else {
                    n3.a aVarI = jd.l.i(strB0);
                    String strConcat = string4.length() > 0 ? "|".concat(string4) : null;
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    ArrayList arrayList = new ArrayList(iIntValue);
                    int i15 = 1;
                    mainActivity = null;
                    int i16 = 0;
                    while (i16 < iIntValue) {
                        int i17 = aVarI.f7236a;
                        String lowerCase = strB0.toLowerCase(Locale.ROOT);
                        jc.i.d(lowerCase, "toLowerCase(...)");
                        StringBuilder sb2 = new StringBuilder();
                        int length2 = lowerCase.length();
                        int i18 = 0;
                        while (i18 < length2) {
                            int i19 = length2;
                            char cCharAt = lowerCase.charAt(i18);
                            if (Character.isDigit(cCharAt)) {
                                i11 = i18;
                            } else {
                                i11 = i18;
                                if (cCharAt == 'x') {
                                }
                                i18 = i11 + 1;
                                length2 = i19;
                            }
                            sb2.append(cCharAt);
                            i18 = i11 + 1;
                            length2 = i19;
                        }
                        String string7 = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        int i20 = 0;
                        for (int i21 = i17 - 1; i20 < i21; i21 = i21) {
                            String str3 = strConcat;
                            jc.i.e(string7, "<this>");
                            Character chValueOf = (i20 < 0 || i20 >= string7.length()) ? null : Character.valueOf(string7.charAt(i20));
                            if (chValueOf == null || !Character.isDigit(chValueOf.charValue())) {
                                sb3.append(kc.d.f6207b.c(0, 10));
                            } else {
                                sb3.append(chValueOf.charValue());
                            }
                            i20++;
                            strConcat = str3;
                            string7 = string7;
                        }
                        String str4 = strConcat;
                        String string8 = sb3.toString();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(string8);
                        jc.i.e(string8, "prefix");
                        int length3 = string8.length() - 1;
                        boolean z4 = true;
                        int i22 = 0;
                        while (-1 < length3) {
                            String str5 = string8;
                            int iG = jd.d.g(string8.charAt(length3) - '0', 9);
                            if (z4 && (iG = iG * 2) > 9) {
                                iG -= 9;
                            }
                            i22 += iG;
                            z4 = !z4;
                            length3--;
                            string8 = str5;
                        }
                        sb4.append((10 - (i22 % 10)) % 10);
                        arrayList.add(sb4.toString());
                        i16++;
                        strConcat = str4;
                    }
                    String str6 = strConcat;
                    ArrayList arrayList2 = new ArrayList(vb.k.U(arrayList));
                    int size = arrayList.size();
                    int i23 = 0;
                    while (i23 < size) {
                        Object obj2 = arrayList.get(i23);
                        int i24 = i23 + 1;
                        String str7 = (String) obj2;
                        jc.i.e(str, "month");
                        jc.i.e(str2, "year");
                        if (str.length() > 0 && str2.length() > 0) {
                            string = "|" + str + '|' + str2;
                            i = size;
                        } else if (str.length() > 0) {
                            StringBuilder sb5 = new StringBuilder("|");
                            sb5.append(str);
                            sb5.append('|');
                            i = size;
                            sb5.append(kc.d.f6207b.c(2026, 2041));
                            string = sb5.toString();
                        } else {
                            i = size;
                            if (str2.length() > 0) {
                                string = "|" + pc.g.p0(2, String.valueOf(kc.d.f6207b.c(i15, 13))) + '|' + str2;
                            } else {
                                kc.a aVar = kc.d.f6207b;
                                string = "|" + pc.g.p0(2, String.valueOf(aVar.c(i15, 13))) + '|' + String.valueOf(aVar.c(2026, 2041));
                            }
                        }
                        if (str6 == null) {
                            StringBuilder sb6 = new StringBuilder("|");
                            mc.e eVar2 = new mc.e(1, aVarI.f7237b, 1);
                            ArrayList arrayList3 = new ArrayList(vb.k.U(eVar2));
                            Iterator it = eVar2.iterator();
                            while (true) {
                                mc.b bVar2 = (mc.b) it;
                                Iterator it2 = it;
                                if (bVar2.f7105d) {
                                    bVar2.nextInt();
                                    arrayList3.add(Integer.valueOf(kc.d.f6207b.c(0, 10)));
                                    i24 = i24;
                                    it = it2;
                                } else {
                                    i10 = i24;
                                    sb6.append(vb.i.e0(arrayList3, "", null, null, null, 62));
                                    string2 = sb6.toString();
                                }
                            }
                        } else {
                            i10 = i24;
                            string2 = str6;
                        }
                        arrayList2.add(str7 + string + string2);
                        i23 = i10;
                        size = i;
                        str2 = str2;
                        i15 = 1;
                    }
                    Log.d("GenerateCcFragment", "Generadas " + arrayList2.size() + " tarjetas para " + strB0 + " (" + aVarI + ')');
                    EditText editText9 = vVar.f4866j0;
                    if (editText9 == null) {
                        jc.i.i("generatedCardsEditText");
                        throw null;
                    }
                    editText9.setText(vb.i.e0(arrayList2, "\n", null, null, null, 62));
                    EditText editText10 = vVar.f4866j0;
                    if (editText10 == null) {
                        jc.i.i("generatedCardsEditText");
                        throw null;
                    }
                    editText10.setVisibility(0);
                    try {
                        if (strB0.length() == 0 || string5.length() == 0 || string6.length() == 0) {
                            Log.e("GenerateCcFragment", "Error: BIN, mes o año no inicializados");
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Estado del Switch: ");
                            Switch r10 = vVar.f4869n0;
                            if (r10 == null) {
                                jc.i.i("saveToDbSwitch");
                                throw null;
                            }
                            sb7.append(r10.isChecked());
                            Log.d("GenerateCcFragment", sb7.toString());
                            Switch r11 = vVar.f4869n0;
                            if (r11 == null) {
                                jc.i.i("saveToDbSwitch");
                                throw null;
                            }
                            if (r11.isChecked()) {
                                vVar.c0(strB0, string5, string6);
                            } else {
                                Log.d("GenerateCcFragment", "El usuario decidió no guardar el BIN en la DB.");
                            }
                        }
                    } catch (Exception e) {
                        Log.e("GenerateCcFragment", "Error inesperado en generateCards: " + e.getMessage());
                    }
                }
                androidx.fragment.app.w wVarT2 = vVar.T();
                MainActivity mainActivity4 = wVarT2 instanceof MainActivity ? (MainActivity) wVarT2 : mainActivity;
                if (mainActivity4 != null) {
                    mainActivity4.z();
                    return;
                }
                return;
            case 6:
                h3.z zVar = (h3.z) obj;
                try {
                    Spinner spinner3 = zVar.f4910f0;
                    if (spinner3 == null) {
                        jc.i.i("countrySpinner");
                        throw null;
                    }
                    zVar.d0(spinner3.getSelectedItem().toString());
                    androidx.fragment.app.w wVarT3 = zVar.T();
                    mainActivity2 = wVarT3 instanceof MainActivity ? (MainActivity) wVarT3 : null;
                    if (mainActivity2 != null) {
                        mainActivity2.z();
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    Log.e("GenerateDataFragment", "Error al manejar el botón: " + e4.getMessage());
                    return;
                }
            case 7:
                g0 g0Var = (g0) obj;
                ProgressBar progressBar2 = g0Var.k0;
                if (progressBar2 == null) {
                    jc.i.i("loader");
                    throw null;
                }
                progressBar2.setVisibility(0);
                LinearLayout linearLayout = g0Var.f4707l0;
                if (linearLayout == null) {
                    jc.i.i("layoutResult");
                    throw null;
                }
                linearLayout.setVisibility(8);
                Toast.makeText(g0Var.U(), g0Var.v(R.string.checking_ip), 0).show();
                com.bumptech.glide.d.v(g0Var.U()).a(new r3.e(0, "https://api.ipbase.com/v1/json/", null, new f0(g0Var, i14), new f0(g0Var, i13)));
                androidx.fragment.app.w wVarT4 = g0Var.T();
                mainActivity2 = wVarT4 instanceof MainActivity ? (MainActivity) wVarT4 : null;
                if (mainActivity2 != null) {
                    mainActivity2.z();
                    return;
                }
                return;
            case 8:
                i1 i1Var = (i1) obj;
                EditText editText11 = i1Var.k0;
                if (editText11 == null) {
                    jc.i.i("myTextBox");
                    throw null;
                }
                Editable text2 = editText11.getText();
                if (text2 == null || text2.length() == 0) {
                    Toast.makeText(i1Var.U(), i1Var.v(R.string.error_enter_email), 0).show();
                    return;
                }
                View viewFindViewById = i1Var.V().findViewById(R.id.cantidad_mail);
                jc.i.d(viewFindViewById, "findViewById(...)");
                Integer numY2 = pc.n.Y(((EditText) viewFindViewById).getText().toString());
                int iIntValue2 = numY2 != null ? numY2.intValue() : 5;
                EditText editText12 = i1Var.k0;
                if (editText12 == null) {
                    jc.i.i("myTextBox");
                    throw null;
                }
                ArrayList arrayListB0 = i1.b0(editText12.getText().toString());
                Spinner spinner4 = i1Var.f4727h0;
                if (spinner4 == null) {
                    jc.i.i("spinner");
                    throw null;
                }
                String string9 = spinner4.getSelectedItem().toString();
                if (jc.i.a(i1Var.f4725f0, "personalizado")) {
                    EditText editText13 = i1Var.f4728i0;
                    if (editText13 == null) {
                        jc.i.i("personalizado");
                        throw null;
                    }
                    string9 = editText13.getText().toString();
                }
                StringBuilder sb8 = new StringBuilder();
                for (int i25 = 0; i25 < iIntValue2; i25++) {
                    if (i25 < arrayListB0.size()) {
                        sb8.append(((String) arrayListB0.get(i25)) + '@' + string9);
                        if (i25 < iIntValue2 - 1) {
                            sb8.append("\n");
                        }
                    }
                }
                EditText editText14 = i1Var.f4729j0;
                if (editText14 == null) {
                    jc.i.i("visualizador");
                    throw null;
                }
                editText14.setText(sb8.toString());
                EditText editText15 = i1Var.f4729j0;
                if (editText15 == null) {
                    jc.i.i("visualizador");
                    throw null;
                }
                editText15.setVisibility(0);
                androidx.fragment.app.w wVarT5 = i1Var.T();
                mainActivity2 = wVarT5 instanceof MainActivity ? (MainActivity) wVarT5 : null;
                if (mainActivity2 != null) {
                    mainActivity2.z();
                    return;
                }
                return;
            case 9:
                MainActivity mainActivity5 = (MainActivity) obj;
                int i26 = MainActivity.f1283j0;
                mainActivity5.startActivity(new Intent(mainActivity5, (Class<?>) SettingsActivity.class));
                return;
            case 10:
                ((x1) obj).t().K();
                return;
            case 11:
                ((a2) obj).b0(null);
                return;
            case 12:
                i2 i2Var = (i2) obj;
                EditText editText16 = i2Var.f4730f0;
                if (editText16 == null) {
                    jc.i.i("searchBinEditText");
                    throw null;
                }
                String string10 = pc.g.B0(editText16.getText().toString()).toString();
                if (string10.length() != 6) {
                    Toast.makeText(i2Var.U(), i2Var.v(R.string.error_exactly_6_digits), 0).show();
                    return;
                }
                try {
                    ProgressBar progressBar3 = i2Var.f4733i0;
                    if (progressBar3 == null) {
                        jc.i.i("searchProgressBar");
                        throw null;
                    }
                    progressBar3.setVisibility(0);
                    EditText editText17 = i2Var.f4732h0;
                    if (editText17 == null) {
                        jc.i.i("searchResultEditText");
                        throw null;
                    }
                    editText17.setVisibility(8);
                    com.bumptech.glide.d.v(i2Var.U()).a(new r3.e(0, "https://api.spacehowen.com/bins-extras/search_bin.php?bin=".concat(string10), null, new h2(i2Var), new h2(i2Var)));
                    androidx.fragment.app.w wVarT6 = i2Var.T();
                    mainActivity2 = wVarT6 instanceof MainActivity ? (MainActivity) wVarT6 : null;
                    if (mainActivity2 != null) {
                        mainActivity2.z();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    ProgressBar progressBar4 = i2Var.f4733i0;
                    if (progressBar4 == null) {
                        jc.i.i("searchProgressBar");
                        throw null;
                    }
                    progressBar4.setVisibility(8);
                    Log.e("SearchBinDbFragment", "Error inesperado en la búsqueda: " + e10.getMessage());
                    Context contextU = i2Var.U();
                    String message = e10.getMessage();
                    Toast.makeText(contextU, i2Var.w(R.string.error_unexpected, message != null ? message : ""), 0).show();
                }
                break;
            case 13:
                int i27 = ChipNavigationBar.L;
                ((pb.c) obj).invoke(view);
                return;
            default:
                ((y4.b) obj).f10560n0.setError(null);
                return;
        }
    }
}
