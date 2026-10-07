package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbbs;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Spinner f4638f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f4639g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Button f4640h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Button f4641i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f4642j0;
    public final List k0 = jd.d.D("0049");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final List f4643l0 = jd.d.D("10050000");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final List f4644m0 = jd.d.D("30003");

    public static String b0(String str, String str2) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Integer.valueOf(str.charAt(i) - '7'));
        }
        return pc.g.p0(2, String.valueOf(98 - new BigInteger(da.v.u(str2, vb.i.e0(arrayList, "", null, null, null, 62), "00")).mod(new BigInteger("97")).intValue()));
    }

    public static String c0(String str) {
        List listS = vb.j.S(1, 2, 4, 8, 5, 10, 9, 7, 3, 6);
        int length = str.length();
        int iIntValue = 0;
        for (int i = 0; i < length; i++) {
            iIntValue += ((Number) listS.get(i)).intValue() * Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int i10 = iIntValue % 11;
        int i11 = i10 != 0 ? 11 - i10 : 0;
        return i11 == 10 ? "1" : String.valueOf(i11);
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_generate_iban, viewGroup, false);
        this.f4638f0 = (Spinner) viewInflate.findViewById(R.id.countrySpinner);
        TextView textView = (TextView) viewInflate.findViewById(R.id.textViewIban);
        this.f4639g0 = textView;
        if (textView == null) {
            jc.i.i("textViewIban");
            throw null;
        }
        textView.setVisibility(8);
        this.f4640h0 = (Button) viewInflate.findViewById(R.id.buttonGenerate);
        Button button = (Button) viewInflate.findViewById(R.id.buttonCopy);
        this.f4641i0 = button;
        if (button == null) {
            jc.i.i("buttonCopy");
            throw null;
        }
        button.setVisibility(8);
        ArrayAdapter<CharSequence> arrayAdapterCreateFromResource = ArrayAdapter.createFromResource(U(), R.array.iban_country_array, android.R.layout.simple_spinner_item);
        jc.i.d(arrayAdapterCreateFromResource, "createFromResource(...)");
        arrayAdapterCreateFromResource.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner = this.f4638f0;
        if (spinner == null) {
            jc.i.i("countrySpinner");
            throw null;
        }
        spinner.setAdapter((SpinnerAdapter) arrayAdapterCreateFromResource);
        Spinner spinner2 = this.f4638f0;
        if (spinner2 == null) {
            jc.i.i("countrySpinner");
            throw null;
        }
        spinner2.setOnItemSelectedListener(new b0(this, 0));
        Button button2 = this.f4640h0;
        if (button2 == null) {
            jc.i.i("buttonGenerate");
            throw null;
        }
        final int i = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f4611b;

            {
                this.f4611b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x03d2  */
            /* JADX WARN: Code duplicated, block: B:103:0x03d8  */
            /* JADX WARN: Code duplicated, block: B:105:0x03dc  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:90:0x03ad  */
            /* JADX WARN: Code duplicated, block: B:92:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:94:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:96:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:97:0x03ca  */
            /* JADX WARN: Code duplicated, block: B:99:0x03ce  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                String strV;
                String str;
                String strB0;
                String strI;
                TextView textView2;
                TextView textView3;
                Button button3;
                androidx.fragment.app.w wVarT;
                MainActivity mainActivity;
                MainActivity mainActivity2;
                String strB;
                int i10;
                int i11 = i;
                Throwable th = null;
                c0 c0Var = this.f4611b;
                switch (i11) {
                    case 0:
                        int i12 = c0Var.f4642j0;
                        int i13 = 10;
                        if (i12 != 0) {
                            if (i12 != 1) {
                                char c10 = 'A';
                                if (i12 == 2) {
                                    th = null;
                                    mc.g gVar = new mc.g(0L, 999999999999L);
                                    kc.c cVar = kc.d.f6206a;
                                    try {
                                        String strP0 = pc.g.p0(12, String.valueOf(jd.l.q(gVar)));
                                        jc.i.e(strP0, "accountNumber");
                                        String strConcat = "00542803280".concat(strP0);
                                        int[] iArr = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5};
                                        int length = strConcat.length();
                                        int upperCase = 0;
                                        for (int i14 = 0; i14 < length; i14++) {
                                            char cCharAt = strConcat.charAt(i14);
                                            upperCase += (Character.isDigit(cCharAt) ? cCharAt - '0' : Character.toUpperCase(cCharAt) - '@') * iArr[i14];
                                        }
                                        String str2 = ((char) ((upperCase % 26) + 65)) + "0542803280" + strP0;
                                        jc.i.e(str2, "bban");
                                        String strConcat2 = str2.concat("IT00");
                                        ArrayList arrayList = new ArrayList(strConcat2.length());
                                        for (int i15 = 0; i15 < strConcat2.length(); i15++) {
                                            char cCharAt2 = strConcat2.charAt(i15);
                                            arrayList.add(Character.isDigit(cCharAt2) ? String.valueOf(cCharAt2) : String.valueOf(Character.toUpperCase(cCharAt2) - '7'));
                                        }
                                        strI = da.v.i("IT", pc.g.p0(2, String.valueOf(98 - new BigInteger(vb.i.e0(arrayList, "", null, null, null, 62)).mod(new BigInteger("97")).intValue())), str2);
                                        StringBuilder sbN = q1.a.n("IBAN generado: ", strI, ", Longitud: ");
                                        sbN.append(strI.length());
                                        System.out.println((Object) sbN.toString());
                                    } catch (IllegalArgumentException e) {
                                        throw new NoSuchElementException(e.getMessage());
                                    }
                                } else if (i12 != 3) {
                                    strI = "";
                                    th = null;
                                } else {
                                    String str3 = (String) vb.i.Z(c0Var.f4644m0);
                                    while (true) {
                                        mc.e eVar = new mc.e(1, i13, 1);
                                        th = th;
                                        ArrayList arrayList2 = new ArrayList(vb.k.U(eVar));
                                        Iterator it = eVar.iterator();
                                        while (true) {
                                            mc.b bVar = (mc.b) it;
                                            if (bVar.f7105d) {
                                                bVar.nextInt();
                                                mc.e eVar2 = new mc.e(0, 9, 1);
                                                kc.c cVar2 = kc.d.f6206a;
                                                arrayList2.add(String.valueOf(jd.d.E(eVar2)));
                                            } else {
                                                String strE0 = vb.i.e0(arrayList2, "", null, null, null, 62);
                                                mc.c cVar3 = new mc.c(c10, 'Z');
                                                kc.c cVar4 = kc.d.f6206a;
                                                try {
                                                    String str4 = strE0 + ((char) kc.d.f6207b.c(c10, cVar3.f7100b + 1));
                                                    jc.i.e(str4, "accountNumber");
                                                    ArrayList arrayList3 = new ArrayList(str4.length());
                                                    for (int i16 = 0; i16 < str4.length(); i16++) {
                                                        char cCharAt3 = str4.charAt(i16);
                                                        arrayList3.add(Integer.valueOf(Character.isDigit(cCharAt3) ? Integer.parseInt(String.valueOf(cCharAt3)) : Character.toUpperCase(cCharAt3) - '7'));
                                                    }
                                                    int size = arrayList3.size();
                                                    int iIntValue = 0;
                                                    char c11 = c10;
                                                    int i17 = 0;
                                                    while (i17 < size) {
                                                        Object obj = arrayList3.get(i17);
                                                        i17++;
                                                        iIntValue = ((Number) obj).intValue() + iIntValue;
                                                    }
                                                    if (iIntValue % 10 == 0) {
                                                        String str5 = str3 + "00070" + str4 + "92";
                                                        jc.i.e(str5, "bban");
                                                        String strConcat3 = str5.concat("FR00");
                                                        ArrayList arrayList4 = new ArrayList(strConcat3.length());
                                                        for (int i18 = 0; i18 < strConcat3.length(); i18++) {
                                                            char cCharAt4 = strConcat3.charAt(i18);
                                                            arrayList4.add(Character.isDigit(cCharAt4) ? String.valueOf(cCharAt4) : String.valueOf(Character.toUpperCase(cCharAt4) - '7'));
                                                        }
                                                        strI = da.v.i("FR", pc.g.p0(2, String.valueOf(98 - new BigInteger(vb.i.e0(arrayList4, "", null, null, null, 62)).mod(new BigInteger("97")).intValue())), str5);
                                                    } else {
                                                        th = th;
                                                        c10 = c11;
                                                        i13 = 10;
                                                    }
                                                } catch (IllegalArgumentException e4) {
                                                    throw new NoSuchElementException(e4.getMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                String str6 = (String) vb.i.Z(c0Var.f4643l0);
                                do {
                                    mc.e eVar3 = new mc.e(0, 999999999, 1);
                                    kc.c cVar5 = kc.d.f6206a;
                                    strB = u3.b.b("5", pc.g.p0(9, String.valueOf(jd.d.E(eVar3))));
                                    List listS = vb.j.S(2, 1, 2, 1, 2, 1, 2, 1, 2, 1);
                                    int length2 = strB.length();
                                    i10 = 0;
                                    for (int i19 = 0; i19 < length2; i19++) {
                                        int iIntValue2 = ((Number) listS.get(i19)).intValue() * Integer.parseInt(String.valueOf(strB.charAt(i19)));
                                        if (iIntValue2 > 9) {
                                            iIntValue2 -= 9;
                                        }
                                        i10 += iIntValue2;
                                    }
                                } while (i10 % 10 != 0);
                                strV = da.v.h(str6, strB);
                                str = "DE";
                                strB0 = c0.b0("DE", strV);
                            }
                            textView2 = c0Var.f4639g0;
                            if (textView2 != null) {
                                jc.i.i("textViewIban");
                                throw th;
                            }
                            textView2.setText(strI);
                            textView3 = c0Var.f4639g0;
                            if (textView3 != null) {
                                jc.i.i("textViewIban");
                                throw th;
                            }
                            textView3.setVisibility(0);
                            button3 = c0Var.f4641i0;
                            if (button3 != null) {
                                jc.i.i("buttonCopy");
                                throw th;
                            }
                            button3.setVisibility(0);
                            wVarT = c0Var.T();
                            if (wVarT instanceof MainActivity) {
                                mainActivity2 = (MainActivity) wVarT;
                            } else {
                                mainActivity = th;
                            }
                            if (mainActivity != 0) {
                                mainActivity = mainActivity2;
                                return;
                            } else {
                                mainActivity = mainActivity2;
                                mainActivity.z();
                                return;
                            }
                        }
                        String str7 = (String) vb.i.Z(c0Var.k0);
                        mc.e eVar4 = new mc.e(zzbbs.zzq.zzf, 9999, 1);
                        kc.c cVar6 = kc.d.f6206a;
                        String strP1 = pc.g.p0(4, String.valueOf(jd.d.E(eVar4)));
                        String strP2 = pc.g.p0(10, String.valueOf(jd.d.E(new mc.e(0, 99999999, 1))));
                        strV = da.v.v(str7, strP1, da.v.h(c0.c0("00" + str7 + strP1), c0.c0(strP2)), strP2);
                        str = "ES";
                        strB0 = c0.b0("ES", strV);
                        strI = da.v.i(str, strB0, strV);
                        textView2 = c0Var.f4639g0;
                        if (textView2 != null) {
                            jc.i.i("textViewIban");
                            throw th;
                        }
                        textView2.setText(strI);
                        textView3 = c0Var.f4639g0;
                        if (textView3 != null) {
                            jc.i.i("textViewIban");
                            throw th;
                        }
                        textView3.setVisibility(0);
                        button3 = c0Var.f4641i0;
                        if (button3 != null) {
                            jc.i.i("buttonCopy");
                            throw th;
                        }
                        button3.setVisibility(0);
                        wVarT = c0Var.T();
                        if (wVarT instanceof MainActivity) {
                            mainActivity2 = (MainActivity) wVarT;
                        } else {
                            mainActivity = th;
                        }
                        if (mainActivity != 0) {
                            mainActivity = mainActivity2;
                            return;
                        } else {
                            mainActivity = mainActivity2;
                            mainActivity.z();
                            return;
                        }
                    default:
                        TextView textView4 = c0Var.f4639g0;
                        if (textView4 == null) {
                            jc.i.i("textViewIban");
                            throw null;
                        }
                        String string = textView4.getText().toString();
                        if (pc.g.m0(string)) {
                            Toast.makeText(c0Var.U(), c0Var.v(R.string.error_generate_iban), 0).show();
                            return;
                        }
                        Object systemService = c0Var.U().getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(c0Var.v(R.string.clipboard_iban), string));
                        Toast.makeText(c0Var.U(), c0Var.v(R.string.iban_copied), 0).show();
                        return;
                }
            }
        });
        Button button3 = this.f4641i0;
        if (button3 == null) {
            jc.i.i("buttonCopy");
            throw null;
        }
        final int i10 = 1;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: h3.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f4611b;

            {
                this.f4611b = this;
            }

            /* JADX WARN: Code duplicated, block: B:101:0x03d2  */
            /* JADX WARN: Code duplicated, block: B:103:0x03d8  */
            /* JADX WARN: Code duplicated, block: B:105:0x03dc  */
            /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:90:0x03ad  */
            /* JADX WARN: Code duplicated, block: B:92:0x03b4  */
            /* JADX WARN: Code duplicated, block: B:94:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:96:0x03c6  */
            /* JADX WARN: Code duplicated, block: B:97:0x03ca  */
            /* JADX WARN: Code duplicated, block: B:99:0x03ce  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                String strV;
                String str;
                String strB0;
                String strI;
                TextView textView2;
                TextView textView3;
                Button button4;
                androidx.fragment.app.w wVarT;
                MainActivity mainActivity;
                MainActivity mainActivity2;
                String strB;
                int i11;
                int i12 = i10;
                Throwable th = null;
                c0 c0Var = this.f4611b;
                switch (i12) {
                    case 0:
                        int i13 = c0Var.f4642j0;
                        int i14 = 10;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                char c10 = 'A';
                                if (i13 == 2) {
                                    th = null;
                                    mc.g gVar = new mc.g(0L, 999999999999L);
                                    kc.c cVar = kc.d.f6206a;
                                    try {
                                        String strP0 = pc.g.p0(12, String.valueOf(jd.l.q(gVar)));
                                        jc.i.e(strP0, "accountNumber");
                                        String strConcat = "00542803280".concat(strP0);
                                        int[] iArr = {1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5};
                                        int length = strConcat.length();
                                        int upperCase = 0;
                                        for (int i15 = 0; i15 < length; i15++) {
                                            char cCharAt = strConcat.charAt(i15);
                                            upperCase += (Character.isDigit(cCharAt) ? cCharAt - '0' : Character.toUpperCase(cCharAt) - '@') * iArr[i15];
                                        }
                                        String str2 = ((char) ((upperCase % 26) + 65)) + "0542803280" + strP0;
                                        jc.i.e(str2, "bban");
                                        String strConcat2 = str2.concat("IT00");
                                        ArrayList arrayList = new ArrayList(strConcat2.length());
                                        for (int i16 = 0; i16 < strConcat2.length(); i16++) {
                                            char cCharAt2 = strConcat2.charAt(i16);
                                            arrayList.add(Character.isDigit(cCharAt2) ? String.valueOf(cCharAt2) : String.valueOf(Character.toUpperCase(cCharAt2) - '7'));
                                        }
                                        strI = da.v.i("IT", pc.g.p0(2, String.valueOf(98 - new BigInteger(vb.i.e0(arrayList, "", null, null, null, 62)).mod(new BigInteger("97")).intValue())), str2);
                                        StringBuilder sbN = q1.a.n("IBAN generado: ", strI, ", Longitud: ");
                                        sbN.append(strI.length());
                                        System.out.println((Object) sbN.toString());
                                    } catch (IllegalArgumentException e) {
                                        throw new NoSuchElementException(e.getMessage());
                                    }
                                } else if (i13 != 3) {
                                    strI = "";
                                    th = null;
                                } else {
                                    String str3 = (String) vb.i.Z(c0Var.f4644m0);
                                    while (true) {
                                        mc.e eVar = new mc.e(1, i14, 1);
                                        th = th;
                                        ArrayList arrayList2 = new ArrayList(vb.k.U(eVar));
                                        Iterator it = eVar.iterator();
                                        while (true) {
                                            mc.b bVar = (mc.b) it;
                                            if (bVar.f7105d) {
                                                bVar.nextInt();
                                                mc.e eVar2 = new mc.e(0, 9, 1);
                                                kc.c cVar2 = kc.d.f6206a;
                                                arrayList2.add(String.valueOf(jd.d.E(eVar2)));
                                            } else {
                                                String strE0 = vb.i.e0(arrayList2, "", null, null, null, 62);
                                                mc.c cVar3 = new mc.c(c10, 'Z');
                                                kc.c cVar4 = kc.d.f6206a;
                                                try {
                                                    String str4 = strE0 + ((char) kc.d.f6207b.c(c10, cVar3.f7100b + 1));
                                                    jc.i.e(str4, "accountNumber");
                                                    ArrayList arrayList3 = new ArrayList(str4.length());
                                                    for (int i17 = 0; i17 < str4.length(); i17++) {
                                                        char cCharAt3 = str4.charAt(i17);
                                                        arrayList3.add(Integer.valueOf(Character.isDigit(cCharAt3) ? Integer.parseInt(String.valueOf(cCharAt3)) : Character.toUpperCase(cCharAt3) - '7'));
                                                    }
                                                    int size = arrayList3.size();
                                                    int iIntValue = 0;
                                                    char c11 = c10;
                                                    int i18 = 0;
                                                    while (i18 < size) {
                                                        Object obj = arrayList3.get(i18);
                                                        i18++;
                                                        iIntValue = ((Number) obj).intValue() + iIntValue;
                                                    }
                                                    if (iIntValue % 10 == 0) {
                                                        String str5 = str3 + "00070" + str4 + "92";
                                                        jc.i.e(str5, "bban");
                                                        String strConcat3 = str5.concat("FR00");
                                                        ArrayList arrayList4 = new ArrayList(strConcat3.length());
                                                        for (int i19 = 0; i19 < strConcat3.length(); i19++) {
                                                            char cCharAt4 = strConcat3.charAt(i19);
                                                            arrayList4.add(Character.isDigit(cCharAt4) ? String.valueOf(cCharAt4) : String.valueOf(Character.toUpperCase(cCharAt4) - '7'));
                                                        }
                                                        strI = da.v.i("FR", pc.g.p0(2, String.valueOf(98 - new BigInteger(vb.i.e0(arrayList4, "", null, null, null, 62)).mod(new BigInteger("97")).intValue())), str5);
                                                    } else {
                                                        th = th;
                                                        c10 = c11;
                                                        i14 = 10;
                                                    }
                                                } catch (IllegalArgumentException e4) {
                                                    throw new NoSuchElementException(e4.getMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                String str6 = (String) vb.i.Z(c0Var.f4643l0);
                                do {
                                    mc.e eVar3 = new mc.e(0, 999999999, 1);
                                    kc.c cVar5 = kc.d.f6206a;
                                    strB = u3.b.b("5", pc.g.p0(9, String.valueOf(jd.d.E(eVar3))));
                                    List listS = vb.j.S(2, 1, 2, 1, 2, 1, 2, 1, 2, 1);
                                    int length2 = strB.length();
                                    i11 = 0;
                                    for (int i110 = 0; i110 < length2; i110++) {
                                        int iIntValue2 = ((Number) listS.get(i110)).intValue() * Integer.parseInt(String.valueOf(strB.charAt(i110)));
                                        if (iIntValue2 > 9) {
                                            iIntValue2 -= 9;
                                        }
                                        i11 += iIntValue2;
                                    }
                                } while (i11 % 10 != 0);
                                strV = da.v.h(str6, strB);
                                str = "DE";
                                strB0 = c0.b0("DE", strV);
                            }
                            textView2 = c0Var.f4639g0;
                            if (textView2 != null) {
                                jc.i.i("textViewIban");
                                throw th;
                            }
                            textView2.setText(strI);
                            textView3 = c0Var.f4639g0;
                            if (textView3 != null) {
                                jc.i.i("textViewIban");
                                throw th;
                            }
                            textView3.setVisibility(0);
                            button4 = c0Var.f4641i0;
                            if (button4 != null) {
                                jc.i.i("buttonCopy");
                                throw th;
                            }
                            button4.setVisibility(0);
                            wVarT = c0Var.T();
                            if (wVarT instanceof MainActivity) {
                                mainActivity2 = (MainActivity) wVarT;
                            } else {
                                mainActivity = th;
                            }
                            if (mainActivity != 0) {
                                mainActivity = mainActivity2;
                                return;
                            } else {
                                mainActivity = mainActivity2;
                                mainActivity.z();
                                return;
                            }
                        }
                        String str7 = (String) vb.i.Z(c0Var.k0);
                        mc.e eVar4 = new mc.e(zzbbs.zzq.zzf, 9999, 1);
                        kc.c cVar6 = kc.d.f6206a;
                        String strP1 = pc.g.p0(4, String.valueOf(jd.d.E(eVar4)));
                        String strP2 = pc.g.p0(10, String.valueOf(jd.d.E(new mc.e(0, 99999999, 1))));
                        strV = da.v.v(str7, strP1, da.v.h(c0.c0("00" + str7 + strP1), c0.c0(strP2)), strP2);
                        str = "ES";
                        strB0 = c0.b0("ES", strV);
                        strI = da.v.i(str, strB0, strV);
                        textView2 = c0Var.f4639g0;
                        if (textView2 != null) {
                            jc.i.i("textViewIban");
                            throw th;
                        }
                        textView2.setText(strI);
                        textView3 = c0Var.f4639g0;
                        if (textView3 != null) {
                            jc.i.i("textViewIban");
                            throw th;
                        }
                        textView3.setVisibility(0);
                        button4 = c0Var.f4641i0;
                        if (button4 != null) {
                            jc.i.i("buttonCopy");
                            throw th;
                        }
                        button4.setVisibility(0);
                        wVarT = c0Var.T();
                        if (wVarT instanceof MainActivity) {
                            mainActivity2 = (MainActivity) wVarT;
                        } else {
                            mainActivity = th;
                        }
                        if (mainActivity != 0) {
                            mainActivity = mainActivity2;
                            return;
                        } else {
                            mainActivity = mainActivity2;
                            mainActivity.z();
                            return;
                        }
                    default:
                        TextView textView4 = c0Var.f4639g0;
                        if (textView4 == null) {
                            jc.i.i("textViewIban");
                            throw null;
                        }
                        String string = textView4.getText().toString();
                        if (pc.g.m0(string)) {
                            Toast.makeText(c0Var.U(), c0Var.v(R.string.error_generate_iban), 0).show();
                            return;
                        }
                        Object systemService = c0Var.U().getSystemService("clipboard");
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(c0Var.v(R.string.clipboard_iban), string));
                        Toast.makeText(c0Var.U(), c0Var.v(R.string.iban_copied), 0).show();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
