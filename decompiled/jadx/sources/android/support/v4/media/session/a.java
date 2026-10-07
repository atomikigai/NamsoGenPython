package android.support.v4.media.session;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import b0.h;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffo;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import e6.o3;
import e6.t;
import fa.c1;
import g.f;
import h6.o0;
import ic.l;
import j$.util.DesugarTimeZone;
import j3.c;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jc.i;
import jc.o;
import jc.p;
import jc.q;
import l3.a1;
import l3.b1;
import l3.d0;
import l3.f0;
import l3.p0;
import l3.r0;
import l3.u0;
import l3.x0;
import n3.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.e;
import pc.g;
import pc.n;
import u0.j;
import v9.b0;
import v9.h0;
import v9.y;
import vb.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    public static final void A(c cVar, Activity activity, ArrayList arrayList, q qVar, a1 a1Var) {
        String str;
        boolean z4;
        Activity activity2 = activity;
        q qVar2 = qVar;
        c cVar2 = cVar;
        LinearLayout linearLayout = cVar2.f5662d;
        linearLayout.removeAllViews();
        String string = activity2.getString(R.string.proxy_import_all);
        i.d(string, "getString(...)");
        linearLayout.addView(B(activity2, string, null, arrayList.size(), qVar2.f5776a == null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        i.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            i.d(next, "next(...)");
            n3.c cVar3 = ((b1) next).f6523a;
            String str2 = cVar3.f7250f;
            if (str2 == null) {
                str2 = cVar3.h;
            }
            if (str2 != null) {
                Integer num = (Integer) linkedHashMap.get(str2);
                linkedHashMap.put(str2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        Log.d("KRYPT-PROXY", "pills países=" + linkedHashMap);
        Set setEntrySet = linkedHashMap.entrySet();
        i.d(setEntrySet, "<get-entries>(...)");
        for (Object obj : vb.i.i0(setEntrySet, new h(9))) {
            i.d(obj, "next(...)");
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            i.d(key, "component1(...)");
            String str3 = (String) key;
            Object value = entry.getValue();
            i.d(value, "component2(...)");
            Integer num2 = (Integer) value;
            Pattern patternCompile = Pattern.compile("[A-Za-z]{2}");
            i.d(patternCompile, "compile(...)");
            if (patternCompile.matcher(str3).matches()) {
                String upperCase = str3.toUpperCase(Locale.ROOT);
                i.d(upperCase, "toUpperCase(...)");
                if (str3.equals(upperCase)) {
                    str = str3;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (arrayList.isEmpty()) {
                z4 = false;
                break;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z4 = false;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                b1 b1Var = (b1) obj2;
                n3.c cVar4 = b1Var.f6523a;
                String str4 = cVar4.f7250f;
                if (str4 == null) {
                    str4 = cVar4.h;
                }
                if (i.a(str4, str3) && b1Var.f6523a.i) {
                    z4 = true;
                    break;
                }
            }
            linearLayout.addView(B(activity2, (str == null || !z4) ? str != null ? g.B0("❔ ".concat(d.e(str))).toString() : str3 : g.B0(d.a(str) + ' ' + d.e(str)).toString(), str3, num2.intValue(), i.a(qVar2.f5776a, str3)));
        }
        int childCount = linearLayout.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            linearLayout.getChildAt(i10).setOnClickListener(new f0(qVar2, a1Var, cVar2, activity2, arrayList, 1));
            i10++;
            cVar2 = cVar;
            activity2 = activity;
            qVar2 = qVar;
        }
    }

    public static final TextView B(Activity activity, String str, String str2, int i, boolean z4) {
        TextView textView = new TextView(activity);
        textView.setText(str + " · " + i);
        textView.setTag(str2);
        textView.setPadding(e(activity, 12), e(activity, 5), e(activity, 12), e(activity, 5));
        textView.setGravity(17);
        textView.setTextSize(12.0f);
        textView.setTextColor(z4 ? -1 : Color.parseColor("#FFCFCFCF"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(e(activity, 14));
        gradientDrawable.setColor(Color.parseColor(z4 ? "#FF5A5590" : "#FF252525"));
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(e(activity, 6));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public static final void C(c cVar, o oVar, o oVar2, f fVar, w wVar, o oVar3, a1 a1Var, ArrayList arrayList, q qVar) {
        oVar.f5774a = true;
        oVar2.f5774a = false;
        oVar3.f5774a = false;
        a1Var.h = false;
        LinearLayout linearLayout = cVar.e;
        LinearLayout linearLayout2 = cVar.f5663f;
        TextView textView = cVar.f5659a;
        linearLayout.setVisibility(0);
        cVar.f5660b.setVisibility(8);
        TextView textView2 = cVar.f5665j;
        textView2.setVisibility(8);
        textView2.setText("");
        cVar.f5661c.setVisibility(8);
        cVar.f5664g.setVisibility(8);
        cVar.f5668m.setVisibility(8);
        cVar.h.setVisibility(8);
        fVar.b(-1).setVisibility(8);
        linearLayout2.setVisibility(0);
        cVar.f5666k.setVisibility(0);
        cVar.f5667l.setVisibility(8);
        cVar.f5669n.setVisibility(8);
        cVar.f5670o.setVisibility(8);
        cVar.i.setVisibility(8);
        textView.setVisibility(0);
        textView.setOnClickListener(new p0(cVar, oVar, oVar2, fVar, wVar, oVar3, a1Var, arrayList, qVar));
        Button buttonB = fVar.b(-2);
        if (buttonB != null) {
            buttonB.setText(wVar.getString(R.string.proxy_close));
        }
    }

    public static final void D(o oVar, o oVar2, o oVar3, q qVar, ArrayList arrayList, ArrayList arrayList2, c cVar, boolean z4, q qVar2, Activity activity, a1 a1Var, f fVar, String str) {
        oVar.f5774a = true;
        oVar2.f5774a = false;
        oVar3.f5774a = false;
        qVar.f5776a = null;
        arrayList.clear();
        arrayList.addAll(vb.i.i0(arrayList2, new xb.a(new l[]{new h3.o(12), new l3.g(str, 1), new h3.o(13)})));
        LinearLayout linearLayout = cVar.e;
        TextView textView = cVar.f5670o;
        LinearLayout linearLayout2 = cVar.f5663f;
        linearLayout.setVisibility(8);
        cVar.f5660b.setVisibility(8);
        TextView textView2 = cVar.f5665j;
        textView2.setVisibility(8);
        textView2.setText("");
        cVar.f5661c.setVisibility(0);
        cVar.f5664g.setVisibility(8);
        cVar.f5668m.setVisibility(8);
        cVar.h.setVisibility(0);
        if (z4) {
            linearLayout2.setVisibility(0);
            cVar.f5666k.setVisibility(0);
            cVar.f5667l.setVisibility(0);
            cVar.f5669n.setVisibility(arrayList2.isEmpty() ? 8 : 0);
            textView.setVisibility(((List) qVar2.f5776a).isEmpty() ? 8 : 0);
            textView.setText(activity.getString(R.string.proxy_retest_fails, Integer.valueOf(((List) qVar2.f5776a).size())));
            cVar.i.setVisibility(0);
        } else {
            linearLayout2.setVisibility(8);
        }
        A(cVar, activity, arrayList, qVar, a1Var);
        ArrayList arrayListG = G(qVar, arrayList);
        a1Var.getClass();
        i.e(arrayListG, "list");
        a1Var.e = arrayListG;
        a1Var.c();
        a1Var.h = z4;
        fVar.b(-1).setVisibility(8);
        Button buttonB = fVar.b(-2);
        if (buttonB != null) {
            buttonB.setEnabled(true);
        }
        if (buttonB != null) {
            buttonB.setText(activity.getString(z4 ? R.string.proxy_close : R.string.proxy_cancel));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f A[LOOP:1: B:48:0x0179->B:50:0x017f, LOOP_END] */
    public static void E(final ArrayList arrayList, final ArrayList arrayList2, final w wVar, o oVar, o oVar2, final AtomicBoolean atomicBoolean, c cVar, a1 a1Var, f fVar, q qVar, final q qVar2, final o oVar3, final String str, List list, int i) {
        w wVar2;
        c cVar2;
        a1 a1Var2;
        f fVar2;
        q qVar3;
        List<b1> listN0;
        List listN1;
        final o oVar4;
        final o oVar5;
        Button buttonB;
        Button buttonB2;
        final p pVar;
        final List<b1> list2;
        final p pVar2;
        final p pVar3;
        int i10;
        final Object obj;
        ExecutorService executorServiceNewFixedThreadPool;
        final boolean z4 = (i & 16384) == 0;
        final boolean z10 = (32768 & i) == 0;
        List list3 = (i & 65536) != 0 ? null : list;
        if (list3 == null) {
            if (!z4) {
                wVar2 = wVar;
                cVar2 = cVar;
                a1Var2 = a1Var;
                fVar2 = fVar;
                F(arrayList, cVar2, wVar2, qVar, fVar2, a1Var2);
                Log.d("KRYPT-PROXY", "startTesting: lote pegado → " + arrayList.size() + " entradas");
                qVar3 = qVar;
                listN0 = vb.i.n0(G(qVar3, arrayList));
            } else {
                if (arrayList2.isEmpty()) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                Log.d("KRYPT-PROXY", "startTesting: RETEST del pool (" + arrayList2.size() + ')');
                listN1 = vb.i.n0(arrayList);
            }
            if (listN0.isEmpty()) {
                Toast.makeText(wVar2, R.string.proxy_import_none, 0).show();
                return;
            }
            oVar4 = oVar;
            oVar4.f5774a = true;
            oVar5 = oVar2;
            oVar5.f5774a = false;
            atomicBoolean.set(false);
            cVar2.e.setVisibility(8);
            cVar2.f5660b.setVisibility(8);
            cVar2.f5661c.setVisibility(8);
            cVar2.f5663f.setVisibility(8);
            cVar2.f5664g.setVisibility(0);
            cVar2.f5668m.setVisibility(0);
            cVar2.h.setVisibility(0);
            for (b1 b1Var : listN0) {
                if (b1Var.f6524b != 2 || b1Var.f6524b == 0 || b1Var.f6524b == 3) {
                    b1Var.f6524b = 1;
                }
            }
            a1Var2.e = listN0;
            a1Var2.c();
            a1Var2.h = false;
            cVar2.f5664g.setMax(listN0.size());
            cVar2.f5664g.setProgress(0);
            buttonB = fVar2.b(-1);
            if (buttonB != null) {
                buttonB.setVisibility(8);
            }
            buttonB2 = fVar2.b(-2);
            if (buttonB2 != null) {
                buttonB2.setText(wVar2.getString(R.string.proxy_import_stop));
            }
            pVar = new p();
            list2 = listN0;
            pVar2 = new p();
            pVar3 = new p();
            i10 = 0;
            obj = new Object();
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8, new k3.p(2));
            for (final b1 b1Var2 : list2) {
                final q qVar4 = qVar3;
                final f fVar3 = fVar2;
                ExecutorService executorService = executorServiceNewFixedThreadPool;
                final c cVar3 = cVar2;
                final a1 a1Var3 = a1Var2;
                final int i11 = i10;
                executorService.execute(new Runnable() { // from class: l3.q0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        n3.h hVarJ;
                        Object obj2;
                        jc.p pVar4;
                        int i12 = i11;
                        final List list4 = list2;
                        final b1 b1Var3 = b1Var2;
                        final androidx.fragment.app.w wVar3 = wVar;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        Object obj3 = obj;
                        jc.p pVar5 = pVar;
                        jc.p pVar6 = pVar2;
                        jc.p pVar7 = pVar3;
                        final a1 a1Var4 = a1Var3;
                        final j3.c cVar4 = cVar3;
                        final boolean z11 = z4;
                        final boolean z12 = z10;
                        final jc.o oVar6 = oVar4;
                        final jc.o oVar7 = oVar5;
                        final ArrayList arrayList3 = arrayList;
                        final ArrayList arrayList4 = arrayList2;
                        final jc.q qVar5 = qVar2;
                        final jc.o oVar8 = oVar3;
                        final jc.q qVar6 = qVar4;
                        final g.f fVar4 = fVar3;
                        final String str2 = str;
                        StringBuilder sb2 = new StringBuilder("task[");
                        sb2.append(i12);
                        sb2.append('/');
                        sb2.append(list4.size());
                        sb2.append("] ");
                        sb2.append(b1Var3.f6523a.f7246a);
                        sb2.append(' ');
                        sb2.append(b1Var3.f6523a.f7247b);
                        sb2.append(':');
                        sb2.append(b1Var3.f6523a.f7248c);
                        sb2.append(" user='");
                        sb2.append(b1Var3.f6523a.f7249d);
                        sb2.append("' pass=");
                        sb2.append(b1Var3.f6523a.e.length() == 0 ? "—" : "***");
                        Log.d("KRYPT-PROXY", sb2.toString());
                        if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                            return;
                        }
                        if (atomicBoolean2.get()) {
                            hVarJ = null;
                        } else {
                            n3.i iVar = n3.i.f7270a;
                            n3.c cVar5 = b1Var3.f6523a;
                            hVarJ = n3.i.j(cVar5.f7246a, cVar5.f7248c, cVar5.f7247b, cVar5.f7249d, cVar5.e);
                        }
                        synchronized (obj3) {
                            try {
                                pVar5.f5775a++;
                                if (hVarJ == null) {
                                    b1Var3.f6524b = 0;
                                    pVar4 = pVar7;
                                } else {
                                    b1Var3.f6524b = hVarJ.f7264a ? 2 : 3;
                                    b1Var3.f6525c = hVarJ.f7266c;
                                    StringBuilder sb3 = new StringBuilder("prueba ");
                                    sb3.append(b1Var3.a());
                                    sb3.append(": ok=");
                                    sb3.append(hVarJ.f7264a);
                                    sb3.append(" err=");
                                    sb3.append(hVarJ.f7265b);
                                    sb3.append(" ms=");
                                    pVar4 = pVar7;
                                    sb3.append(hVarJ.f7266c);
                                    sb3.append(" iso=");
                                    sb3.append(hVarJ.f7267d);
                                    Log.d("KRYPT-PROXY", sb3.toString());
                                    if (hVarJ.f7264a) {
                                        if (hVarJ.f7268f) {
                                            n3.c cVar6 = b1Var3.f6523a;
                                            cVar6.getClass();
                                            cVar6.f7249d = "";
                                            n3.c cVar7 = b1Var3.f6523a;
                                            cVar7.getClass();
                                            cVar7.e = "";
                                            Log.d("KRYPT-PROXY", "prueba: funciona SIN credenciales (whitelist)");
                                        }
                                        String str3 = hVarJ.f7267d;
                                        if (str3 != null) {
                                            n3.c cVar8 = b1Var3.f6523a;
                                            cVar8.f7250f = str3;
                                            cVar8.f7251g = hVarJ.e;
                                            cVar8.i = hVarJ.f7269g >= 2;
                                        } else {
                                            n3.c cVar9 = b1Var3.f6523a;
                                            cVar9.f7250f = null;
                                            cVar9.f7251g = null;
                                            cVar9.i = false;
                                        }
                                        pVar6.f5775a++;
                                    } else {
                                        pVar4.f5775a++;
                                    }
                                }
                                final int i13 = pVar5.f5775a;
                                final int i14 = pVar6.f5775a;
                                final int i15 = pVar4.f5775a;
                                if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                                    obj2 = obj3;
                                } else {
                                    obj2 = obj3;
                                    try {
                                        wVar3.runOnUiThread(new Runnable() { // from class: l3.t0
                                            @Override // java.lang.Runnable
                                            public final void run() throws JSONException {
                                                int i16;
                                                int i17;
                                                int i18;
                                                a1 a1Var5 = a1Var4;
                                                List list5 = list4;
                                                b1 b1Var4 = b1Var3;
                                                j3.c cVar10 = cVar4;
                                                int i19 = i13;
                                                androidx.fragment.app.w wVar4 = wVar3;
                                                int i20 = i14;
                                                int i21 = i15;
                                                boolean z13 = z11;
                                                boolean z14 = z12;
                                                jc.o oVar9 = oVar6;
                                                jc.o oVar10 = oVar7;
                                                ArrayList arrayList5 = arrayList3;
                                                ArrayList arrayList6 = arrayList4;
                                                jc.q qVar7 = qVar5;
                                                jc.o oVar11 = oVar8;
                                                jc.q qVar8 = qVar6;
                                                g.f fVar5 = fVar4;
                                                String str4 = str2;
                                                a1Var5.f10251a.c(list5.indexOf(b1Var4));
                                                cVar10.f5664g.setProgress(i19);
                                                cVar10.f5668m.setText(wVar4.getString(R.string.proxy_import_testing, Integer.valueOf(i19), Integer.valueOf(list5.size()), Integer.valueOf(i20), Integer.valueOf(i21)));
                                                if (i19 == list5.size()) {
                                                    oVar9.f5774a = false;
                                                    oVar10.f5774a = true;
                                                    if (z13 && !z14) {
                                                        ArrayList arrayList7 = new ArrayList();
                                                        int size = arrayList5.size();
                                                        int i22 = 0;
                                                        while (i22 < size) {
                                                            Object obj4 = arrayList5.get(i22);
                                                            i22++;
                                                            if (((b1) obj4).f6524b != 3) {
                                                                arrayList7.add(obj4);
                                                            }
                                                        }
                                                        int size2 = arrayList5.size() - arrayList7.size();
                                                        arrayList6.clear();
                                                        arrayList6.addAll(arrayList7);
                                                        android.support.v4.media.session.a.x(arrayList6);
                                                        android.support.v4.media.session.a.D(oVar10, oVar9, oVar11, qVar8, arrayList5, arrayList6, cVar10, true, qVar7, wVar4, a1Var5, fVar5, str4);
                                                        Toast.makeText(wVar4, wVar4.getString(R.string.proxy_retest_done, Integer.valueOf(i20), Integer.valueOf(size2)), 0).show();
                                                        return;
                                                    }
                                                    jc.o oVar12 = oVar9;
                                                    Iterator it = arrayList5.iterator();
                                                    jc.i.d(it, "iterator(...)");
                                                    while (it.hasNext()) {
                                                        Object next = it.next();
                                                        jc.i.d(next, "next(...)");
                                                        b1 b1Var5 = (b1) next;
                                                        jc.o oVar13 = oVar12;
                                                        if (b1Var5.f6524b == 2) {
                                                            int size3 = arrayList6.size();
                                                            int i23 = 0;
                                                            int i24 = 0;
                                                            while (true) {
                                                                if (i23 >= size3) {
                                                                    i18 = -1;
                                                                    break;
                                                                }
                                                                Object obj5 = arrayList6.get(i23);
                                                                int i25 = i23 + 1;
                                                                int i26 = size3;
                                                                if (jc.i.a(((b1) obj5).a(), b1Var5.a())) {
                                                                    i18 = i24;
                                                                    break;
                                                                } else {
                                                                    i24++;
                                                                    i23 = i25;
                                                                    size3 = i26;
                                                                }
                                                            }
                                                            if (i18 >= 0) {
                                                                arrayList6.set(i18, b1Var5);
                                                            } else {
                                                                arrayList6.add(b1Var5);
                                                            }
                                                        }
                                                        oVar12 = oVar13;
                                                    }
                                                    jc.o oVar14 = oVar12;
                                                    ArrayList arrayList8 = new ArrayList();
                                                    int size4 = arrayList5.size();
                                                    int i27 = 0;
                                                    while (i27 < size4) {
                                                        Object obj6 = arrayList5.get(i27);
                                                        int i28 = i27 + 1;
                                                        int i29 = size4;
                                                        if (((b1) obj6).f6524b == 3) {
                                                            arrayList8.add(obj6);
                                                        }
                                                        size4 = i29;
                                                        i27 = i28;
                                                    }
                                                    qVar7.f5776a = arrayList8;
                                                    StringBuilder sb4 = new StringBuilder("finalize: ok=");
                                                    if (arrayList5.isEmpty()) {
                                                        i16 = 0;
                                                    } else {
                                                        int size5 = arrayList5.size();
                                                        int i30 = 0;
                                                        i16 = 0;
                                                        while (i30 < size5) {
                                                            Object obj7 = arrayList5.get(i30);
                                                            int i31 = i30 + 1;
                                                            int i32 = size5;
                                                            if (((b1) obj7).f6524b == 2 && (i16 = i16 + 1) < 0) {
                                                                throw new ArithmeticException("Count overflow has happened.");
                                                            }
                                                            i30 = i31;
                                                            size5 = i32;
                                                        }
                                                    }
                                                    sb4.append(i16);
                                                    sb4.append(" fail=");
                                                    sb4.append(((List) qVar7.f5776a).size());
                                                    sb4.append(" pend=");
                                                    if (arrayList5.isEmpty()) {
                                                        i17 = 0;
                                                    } else {
                                                        int size6 = arrayList5.size();
                                                        i17 = 0;
                                                        int i33 = 0;
                                                        while (i33 < size6) {
                                                            Object obj8 = arrayList5.get(i33);
                                                            i33++;
                                                            int i34 = size6;
                                                            if (((b1) obj8).f6524b == 0 && (i17 = i17 + 1) < 0) {
                                                                throw new ArithmeticException("Count overflow has happened.");
                                                            }
                                                            size6 = i34;
                                                        }
                                                    }
                                                    sb4.append(i17);
                                                    sb4.append(" | fallidos=[");
                                                    sb4.append(vb.i.e0((Iterable) qVar7.f5776a, null, null, null, new h3.o(15), 31));
                                                    sb4.append(']');
                                                    Log.d("KRYPT-PROXY", sb4.toString());
                                                    android.support.v4.media.session.a.x(arrayList6);
                                                    android.support.v4.media.session.a.D(oVar10, oVar14, oVar11, qVar8, arrayList5, arrayList6, cVar10, true, qVar7, wVar4, a1Var5, fVar5, str4);
                                                    if (z14) {
                                                        Toast.makeText(wVar4, wVar4.getString(R.string.proxy_retest_fails_done, Integer.valueOf(i20), Integer.valueOf(arrayList5.size())), 0).show();
                                                    } else if (i20 > 0) {
                                                        cVar10.h.g0(0);
                                                    }
                                                }
                                            }
                                        });
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj3;
                            }
                        }
                    }
                });
                oVar4 = oVar;
                oVar5 = oVar2;
                cVar2 = cVar;
                a1Var2 = a1Var;
                fVar2 = fVar;
                qVar3 = qVar;
                executorServiceNewFixedThreadPool = executorService;
                i10++;
            }
            executorServiceNewFixedThreadPool.shutdown();
        }
        arrayList.clear();
        arrayList.addAll(list3);
        Log.d("KRYPT-PROXY", "startTesting: REINTENTO de " + list3.size() + " fallidos");
        listN1 = vb.i.n0(arrayList);
        wVar2 = wVar;
        a1Var2 = a1Var;
        fVar2 = fVar;
        qVar3 = qVar;
        listN0 = listN1;
        cVar2 = cVar;
        if (listN0.isEmpty()) {
            Toast.makeText(wVar2, R.string.proxy_import_none, 0).show();
            return;
        }
        oVar4 = oVar;
        oVar4.f5774a = true;
        oVar5 = oVar2;
        oVar5.f5774a = false;
        atomicBoolean.set(false);
        cVar2.e.setVisibility(8);
        cVar2.f5660b.setVisibility(8);
        cVar2.f5661c.setVisibility(8);
        cVar2.f5663f.setVisibility(8);
        cVar2.f5664g.setVisibility(0);
        cVar2.f5668m.setVisibility(0);
        cVar2.h.setVisibility(0);
        while (r10.hasNext()) {
            if (b1Var.f6524b != 2) {
                b1Var.f6524b = 1;
            } else {
                b1Var.f6524b = 1;
            }
        }
        a1Var2.e = listN0;
        a1Var2.c();
        a1Var2.h = false;
        cVar2.f5664g.setMax(listN0.size());
        cVar2.f5664g.setProgress(0);
        buttonB = fVar2.b(-1);
        if (buttonB != null) {
            buttonB.setVisibility(8);
        }
        buttonB2 = fVar2.b(-2);
        if (buttonB2 != null) {
            buttonB2.setText(wVar2.getString(R.string.proxy_import_stop));
        }
        pVar = new p();
        list2 = listN0;
        pVar2 = new p();
        pVar3 = new p();
        i10 = 0;
        obj = new Object();
        executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(8, new k3.p(2));
        while (r23.hasNext()) {
            final q qVar5 = qVar3;
            final f fVar4 = fVar2;
            ExecutorService executorService2 = executorServiceNewFixedThreadPool;
            final c cVar4 = cVar2;
            final a1 a1Var4 = a1Var2;
            final int i12 = i10;
            executorService2.execute(new Runnable() { // from class: l3.q0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    n3.h hVarJ;
                    Object obj2;
                    jc.p pVar4;
                    int i13 = i12;
                    final List list4 = list2;
                    final b1 b1Var3 = b1Var2;
                    final androidx.fragment.app.w wVar3 = wVar;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Object obj3 = obj;
                    jc.p pVar5 = pVar;
                    jc.p pVar6 = pVar2;
                    jc.p pVar7 = pVar3;
                    final a1 a1Var5 = a1Var4;
                    final j3.c cVar5 = cVar4;
                    final boolean z11 = z4;
                    final boolean z12 = z10;
                    final jc.o oVar6 = oVar4;
                    final jc.o oVar7 = oVar5;
                    final ArrayList arrayList3 = arrayList;
                    final ArrayList arrayList4 = arrayList2;
                    final jc.q qVar6 = qVar2;
                    final jc.o oVar8 = oVar3;
                    final jc.q qVar7 = qVar5;
                    final g.f fVar5 = fVar4;
                    final String str2 = str;
                    StringBuilder sb2 = new StringBuilder("task[");
                    sb2.append(i13);
                    sb2.append('/');
                    sb2.append(list4.size());
                    sb2.append("] ");
                    sb2.append(b1Var3.f6523a.f7246a);
                    sb2.append(' ');
                    sb2.append(b1Var3.f6523a.f7247b);
                    sb2.append(':');
                    sb2.append(b1Var3.f6523a.f7248c);
                    sb2.append(" user='");
                    sb2.append(b1Var3.f6523a.f7249d);
                    sb2.append("' pass=");
                    sb2.append(b1Var3.f6523a.e.length() == 0 ? "—" : "***");
                    Log.d("KRYPT-PROXY", sb2.toString());
                    if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                        return;
                    }
                    if (atomicBoolean2.get()) {
                        hVarJ = null;
                    } else {
                        n3.i iVar = n3.i.f7270a;
                        n3.c cVar6 = b1Var3.f6523a;
                        hVarJ = n3.i.j(cVar6.f7246a, cVar6.f7248c, cVar6.f7247b, cVar6.f7249d, cVar6.e);
                    }
                    synchronized (obj3) {
                        try {
                            pVar5.f5775a++;
                            if (hVarJ == null) {
                                b1Var3.f6524b = 0;
                                pVar4 = pVar7;
                            } else {
                                b1Var3.f6524b = hVarJ.f7264a ? 2 : 3;
                                b1Var3.f6525c = hVarJ.f7266c;
                                StringBuilder sb3 = new StringBuilder("prueba ");
                                sb3.append(b1Var3.a());
                                sb3.append(": ok=");
                                sb3.append(hVarJ.f7264a);
                                sb3.append(" err=");
                                sb3.append(hVarJ.f7265b);
                                sb3.append(" ms=");
                                pVar4 = pVar7;
                                sb3.append(hVarJ.f7266c);
                                sb3.append(" iso=");
                                sb3.append(hVarJ.f7267d);
                                Log.d("KRYPT-PROXY", sb3.toString());
                                if (hVarJ.f7264a) {
                                    if (hVarJ.f7268f) {
                                        n3.c cVar7 = b1Var3.f6523a;
                                        cVar7.getClass();
                                        cVar7.f7249d = "";
                                        n3.c cVar8 = b1Var3.f6523a;
                                        cVar8.getClass();
                                        cVar8.e = "";
                                        Log.d("KRYPT-PROXY", "prueba: funciona SIN credenciales (whitelist)");
                                    }
                                    String str3 = hVarJ.f7267d;
                                    if (str3 != null) {
                                        n3.c cVar9 = b1Var3.f6523a;
                                        cVar9.f7250f = str3;
                                        cVar9.f7251g = hVarJ.e;
                                        cVar9.i = hVarJ.f7269g >= 2;
                                    } else {
                                        n3.c cVar10 = b1Var3.f6523a;
                                        cVar10.f7250f = null;
                                        cVar10.f7251g = null;
                                        cVar10.i = false;
                                    }
                                    pVar6.f5775a++;
                                } else {
                                    pVar4.f5775a++;
                                }
                            }
                            final int i14 = pVar5.f5775a;
                            final int i15 = pVar6.f5775a;
                            final int i16 = pVar4.f5775a;
                            if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                                obj2 = obj3;
                            } else {
                                obj2 = obj3;
                                try {
                                    wVar3.runOnUiThread(new Runnable() { // from class: l3.t0
                                        @Override // java.lang.Runnable
                                        public final void run() throws JSONException {
                                            int i17;
                                            int i18;
                                            int i19;
                                            a1 a1Var6 = a1Var5;
                                            List list5 = list4;
                                            b1 b1Var4 = b1Var3;
                                            j3.c cVar11 = cVar5;
                                            int i110 = i14;
                                            androidx.fragment.app.w wVar4 = wVar3;
                                            int i20 = i15;
                                            int i21 = i16;
                                            boolean z13 = z11;
                                            boolean z14 = z12;
                                            jc.o oVar9 = oVar6;
                                            jc.o oVar10 = oVar7;
                                            ArrayList arrayList5 = arrayList3;
                                            ArrayList arrayList6 = arrayList4;
                                            jc.q qVar8 = qVar6;
                                            jc.o oVar11 = oVar8;
                                            jc.q qVar9 = qVar7;
                                            g.f fVar6 = fVar5;
                                            String str4 = str2;
                                            a1Var6.f10251a.c(list5.indexOf(b1Var4));
                                            cVar11.f5664g.setProgress(i110);
                                            cVar11.f5668m.setText(wVar4.getString(R.string.proxy_import_testing, Integer.valueOf(i110), Integer.valueOf(list5.size()), Integer.valueOf(i20), Integer.valueOf(i21)));
                                            if (i110 == list5.size()) {
                                                oVar9.f5774a = false;
                                                oVar10.f5774a = true;
                                                if (z13 && !z14) {
                                                    ArrayList arrayList7 = new ArrayList();
                                                    int size = arrayList5.size();
                                                    int i22 = 0;
                                                    while (i22 < size) {
                                                        Object obj4 = arrayList5.get(i22);
                                                        i22++;
                                                        if (((b1) obj4).f6524b != 3) {
                                                            arrayList7.add(obj4);
                                                        }
                                                    }
                                                    int size2 = arrayList5.size() - arrayList7.size();
                                                    arrayList6.clear();
                                                    arrayList6.addAll(arrayList7);
                                                    android.support.v4.media.session.a.x(arrayList6);
                                                    android.support.v4.media.session.a.D(oVar10, oVar9, oVar11, qVar9, arrayList5, arrayList6, cVar11, true, qVar8, wVar4, a1Var6, fVar6, str4);
                                                    Toast.makeText(wVar4, wVar4.getString(R.string.proxy_retest_done, Integer.valueOf(i20), Integer.valueOf(size2)), 0).show();
                                                    return;
                                                }
                                                jc.o oVar12 = oVar9;
                                                Iterator it = arrayList5.iterator();
                                                jc.i.d(it, "iterator(...)");
                                                while (it.hasNext()) {
                                                    Object next = it.next();
                                                    jc.i.d(next, "next(...)");
                                                    b1 b1Var5 = (b1) next;
                                                    jc.o oVar13 = oVar12;
                                                    if (b1Var5.f6524b == 2) {
                                                        int size3 = arrayList6.size();
                                                        int i23 = 0;
                                                        int i24 = 0;
                                                        while (true) {
                                                            if (i23 >= size3) {
                                                                i19 = -1;
                                                                break;
                                                            }
                                                            Object obj5 = arrayList6.get(i23);
                                                            int i25 = i23 + 1;
                                                            int i26 = size3;
                                                            if (jc.i.a(((b1) obj5).a(), b1Var5.a())) {
                                                                i19 = i24;
                                                                break;
                                                            } else {
                                                                i24++;
                                                                i23 = i25;
                                                                size3 = i26;
                                                            }
                                                        }
                                                        if (i19 >= 0) {
                                                            arrayList6.set(i19, b1Var5);
                                                        } else {
                                                            arrayList6.add(b1Var5);
                                                        }
                                                    }
                                                    oVar12 = oVar13;
                                                }
                                                jc.o oVar14 = oVar12;
                                                ArrayList arrayList8 = new ArrayList();
                                                int size4 = arrayList5.size();
                                                int i27 = 0;
                                                while (i27 < size4) {
                                                    Object obj6 = arrayList5.get(i27);
                                                    int i28 = i27 + 1;
                                                    int i29 = size4;
                                                    if (((b1) obj6).f6524b == 3) {
                                                        arrayList8.add(obj6);
                                                    }
                                                    size4 = i29;
                                                    i27 = i28;
                                                }
                                                qVar8.f5776a = arrayList8;
                                                StringBuilder sb4 = new StringBuilder("finalize: ok=");
                                                if (arrayList5.isEmpty()) {
                                                    i17 = 0;
                                                } else {
                                                    int size5 = arrayList5.size();
                                                    int i30 = 0;
                                                    i17 = 0;
                                                    while (i30 < size5) {
                                                        Object obj7 = arrayList5.get(i30);
                                                        int i31 = i30 + 1;
                                                        int i32 = size5;
                                                        if (((b1) obj7).f6524b == 2 && (i17 = i17 + 1) < 0) {
                                                            throw new ArithmeticException("Count overflow has happened.");
                                                        }
                                                        i30 = i31;
                                                        size5 = i32;
                                                    }
                                                }
                                                sb4.append(i17);
                                                sb4.append(" fail=");
                                                sb4.append(((List) qVar8.f5776a).size());
                                                sb4.append(" pend=");
                                                if (arrayList5.isEmpty()) {
                                                    i18 = 0;
                                                } else {
                                                    int size6 = arrayList5.size();
                                                    i18 = 0;
                                                    int i33 = 0;
                                                    while (i33 < size6) {
                                                        Object obj8 = arrayList5.get(i33);
                                                        i33++;
                                                        int i34 = size6;
                                                        if (((b1) obj8).f6524b == 0 && (i18 = i18 + 1) < 0) {
                                                            throw new ArithmeticException("Count overflow has happened.");
                                                        }
                                                        size6 = i34;
                                                    }
                                                }
                                                sb4.append(i18);
                                                sb4.append(" | fallidos=[");
                                                sb4.append(vb.i.e0((Iterable) qVar8.f5776a, null, null, null, new h3.o(15), 31));
                                                sb4.append(']');
                                                Log.d("KRYPT-PROXY", sb4.toString());
                                                android.support.v4.media.session.a.x(arrayList6);
                                                android.support.v4.media.session.a.D(oVar10, oVar14, oVar11, qVar9, arrayList5, arrayList6, cVar11, true, qVar8, wVar4, a1Var6, fVar6, str4);
                                                if (z14) {
                                                    Toast.makeText(wVar4, wVar4.getString(R.string.proxy_retest_fails_done, Integer.valueOf(i20), Integer.valueOf(arrayList5.size())), 0).show();
                                                } else if (i20 > 0) {
                                                    cVar11.h.g0(0);
                                                }
                                            }
                                        }
                                    });
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = obj3;
                        }
                    }
                }
            });
            oVar4 = oVar;
            oVar5 = oVar2;
            cVar2 = cVar;
            a1Var2 = a1Var;
            fVar2 = fVar;
            qVar3 = qVar;
            executorServiceNewFixedThreadPool = executorService2;
            i10++;
        }
        executorServiceNewFixedThreadPool.shutdown();
    }

    /* JADX WARN: Code duplicated, block: B:122:0x036d  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:140:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:142:0x041c  */
    /* JADX WARN: Code duplicated, block: B:183:0x020c A[EDGE_INSN: B:183:0x020c->B:70:0x020c BREAK  A[LOOP:3: B:65:0x01eb->B:144:0x043c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0184  */
    /* JADX WARN: Code duplicated, block: B:53:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0203  */
    /* JADX WARN: Code duplicated, block: B:68:0x0205  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213 A[LOOP:2: B:71:0x0211->B:72:0x0213, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0228  */
    /* JADX WARN: Code duplicated, block: B:76:0x0252  */
    /* JADX WARN: Code duplicated, block: B:77:0x0258  */
    public static final void F(ArrayList arrayList, c cVar, w wVar, q qVar, f fVar, a1 a1Var) {
        w wVar2;
        String string;
        int i;
        List listD;
        Iterator it;
        int i10;
        String string2;
        pc.d dVar;
        String str;
        int iN0;
        String str2;
        String str3;
        boolean z4;
        int i11;
        boolean z10;
        Matcher matcher;
        boolean z11;
        o0 o0Var;
        Matcher matcher2;
        String str4;
        Integer numY;
        int iIntValue;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z12;
        String str9;
        int i12;
        Matcher matcher3;
        o0 o0Var2;
        String str10;
        CharSequence charSequenceSubSequence;
        String strSubstring;
        List listV0;
        Object obj;
        int size;
        int i13;
        arrayList.clear();
        pc.f fVar2 = d.f7253a;
        String string3 = cVar.f5660b.getText().toString();
        i.e(string3, "text");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        pc.d dVar2 = new pc.d(string3);
        while (true) {
            String str11 = "";
            boolean z13 = true;
            if (!dVar2.hasNext()) {
                break;
            }
            String string4 = g.B0((String) dVar2.next()).toString();
            if (string4.length() != 0 && !pc.o.e0(string4, "#", false)) {
                List listV1 = g.v0(string4, new char[]{':'}, 2);
                Log.d("KRYPT-PROXY", "línea: '" + ((listV1.size() <= 1 || !g.g0((CharSequence) listV1.get(1), ':')) ? string4 : q1.a.m(new StringBuilder(), (String) listV1.get(0), ":…")) + '\'');
                Pattern patternCompile = Pattern.compile("\\s+");
                i.d(patternCompile, "compile(...)");
                g.t0(0);
                Matcher matcher4 = patternCompile.matcher(string4);
                if (matcher4.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList3.add(string4.subSequence(iEnd, matcher4.start()).toString());
                        iEnd = matcher4.end();
                    } while (matcher4.find());
                    arrayList3.add(string4.subSequence(iEnd, string4.length()).toString());
                    listD = arrayList3;
                } else {
                    listD = jd.d.D(string4.toString());
                }
                Iterator it2 = listD.iterator();
                while (it2.hasNext()) {
                    String str12 = (String) it2.next();
                    ArrayList arrayList4 = new ArrayList();
                    String string5 = g.B0(str12).toString();
                    if (string5.length() == 0) {
                        it = it2;
                    } else {
                        it = it2;
                        String str13 = "substring(...)";
                        if (pc.o.e0(string5, "socks5://", z13)) {
                            string5 = string5.substring(9);
                            i.d(string5, "substring(...)");
                        } else {
                            i10 = 1;
                            if (pc.o.e0(string5, "socks4://", true)) {
                                string5 = string5.substring(9);
                                i.d(string5, "substring(...)");
                                i10 = 3;
                            } else if (pc.o.e0(string5, "socks://", true)) {
                                string5 = string5.substring(8);
                                i.d(string5, "substring(...)");
                            } else if (pc.o.e0(string5, "https://", true)) {
                                string5 = string5.substring(8);
                                i.d(string5, "substring(...)");
                            } else {
                                if (pc.o.e0(string5, "http://", true)) {
                                    string5 = string5.substring(7);
                                    i.d(string5, "substring(...)");
                                }
                                i10 = -1;
                            }
                            string2 = g.B0(string5).toString();
                            if (string2.length() == 0) {
                                dVar = dVar2;
                                str = str11;
                                iN0 = g.n0(string2, '@', 0, 6);
                                if (iN0 > 0) {
                                    strSubstring = string2.substring(0, iN0);
                                    i.d(strSubstring, "substring(...)");
                                    if (g.g0(strSubstring, ':')) {
                                        listV0 = g.v0(strSubstring, new char[]{':'}, 2);
                                        String str14 = (String) listV0.get(0);
                                        if (1 < listV0.size()) {
                                            obj = listV0.get(1);
                                        } else {
                                            obj = str;
                                        }
                                        str2 = (String) obj;
                                        string2 = string2.substring(iN0 + 1);
                                        i.d(string2, "substring(...)");
                                        str3 = str14;
                                        z4 = true;
                                    } else {
                                        str2 = str;
                                        str3 = str2;
                                        z4 = false;
                                    }
                                } else {
                                    str2 = str;
                                    str3 = str2;
                                    z4 = false;
                                }
                                if (string2.length() != 0) {
                                    String str15 = str2;
                                    boolean z14 = z4;
                                    String str16 = str3;
                                    i11 = 0;
                                    z10 = true;
                                    while (true) {
                                        pc.f fVar3 = d.f7253a;
                                        fVar3.getClass();
                                        matcher = fVar3.f7863a.matcher(string2);
                                        z11 = z10;
                                        i.d(matcher, "matcher(...)");
                                        if (matcher.find(i11)) {
                                            o0Var = new o0(matcher, string2);
                                        } else {
                                            o0Var = null;
                                        }
                                        if (o0Var == null) {
                                            break;
                                        }
                                        matcher2 = (Matcher) o0Var.f5061b;
                                        o0 o0Var3 = o0Var;
                                        str4 = (String) ((e) o0Var.h()).get(1);
                                        numY = n.Y((String) ((e) o0Var3.h()).get(2));
                                        if (numY != null) {
                                            iIntValue = numY.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        if (!g.f0(str4, "..", false) || 1 > iIntValue || iIntValue >= 65536) {
                                            i11 = jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1;
                                            z10 = z11;
                                            str13 = str13;
                                        } else {
                                            if (z14 || !z11) {
                                                str5 = str13;
                                            } else {
                                                String strSubstring2 = string2.substring(jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1);
                                                i.d(strSubstring2, str13);
                                                str5 = str13;
                                                if (pc.o.e0(strSubstring2, ":", false)) {
                                                    char[] cArr = {':'};
                                                    int length = strSubstring2.length();
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 >= length) {
                                                            string2 = string2;
                                                            charSequenceSubSequence = str;
                                                            break;
                                                        }
                                                        int i15 = length;
                                                        char cCharAt = strSubstring2.charAt(i14);
                                                        string2 = string2;
                                                        int i16 = 0;
                                                        while (true) {
                                                            if (i16 >= 1) {
                                                                i16 = -1;
                                                                break;
                                                            } else if (cCharAt == cArr[i16]) {
                                                                break;
                                                            } else {
                                                                i16++;
                                                            }
                                                        }
                                                        if (!(i16 >= 0)) {
                                                            charSequenceSubSequence = strSubstring2.subSequence(i14, strSubstring2.length());
                                                            break;
                                                        } else {
                                                            i14++;
                                                            length = i15;
                                                            string2 = string2;
                                                        }
                                                    }
                                                    List listV2 = g.v0(charSequenceSubSequence.toString(), new char[]{':'}, 6);
                                                    ArrayList arrayList5 = new ArrayList();
                                                    for (Object obj2 : listV2) {
                                                        if (((String) obj2).length() > 0) {
                                                            arrayList5.add(obj2);
                                                        }
                                                    }
                                                    if (arrayList5.size() == 2) {
                                                        Pattern patternCompile2 = Pattern.compile("^[A-Za-z]{2}$");
                                                        i.d(patternCompile2, "compile(...)");
                                                        CharSequence charSequence = (CharSequence) arrayList5.get(0);
                                                        i.e(charSequence, "input");
                                                        if (!patternCompile2.matcher(charSequence).matches()) {
                                                            str16 = (String) arrayList5.get(0);
                                                            str6 = (String) arrayList5.get(1);
                                                        }
                                                    }
                                                    str7 = str16;
                                                    if (hashSet.add(str4 + ':' + iIntValue + ':' + str7)) {
                                                        StringBuilder sb2 = new StringBuilder("parse '");
                                                        sb2.append(str12);
                                                        sb2.append("' → ");
                                                        sb2.append(str4);
                                                        sb2.append(':');
                                                        sb2.append(iIntValue);
                                                        sb2.append(" tipo=");
                                                        sb2.append(i10);
                                                        sb2.append(" user='");
                                                        sb2.append(str7);
                                                        sb2.append("' pass=");
                                                        if (str6.length() == 0) {
                                                            str9 = "—";
                                                        } else {
                                                            str9 = "***";
                                                        }
                                                        sb2.append(str9);
                                                        Log.d("KRYPT-PROXY", sb2.toString());
                                                        if (i10 == -1) {
                                                            i12 = 0;
                                                        } else {
                                                            i12 = i10;
                                                        }
                                                        i.e(str7, "user");
                                                        if (str7.length() == 0) {
                                                            z12 = false;
                                                        } else {
                                                            Pattern patternCompile3 = Pattern.compile("(?i)__cr\\.([a-z]{2})");
                                                            i.d(patternCompile3, "compile(...)");
                                                            matcher3 = patternCompile3.matcher(str7);
                                                            i.d(matcher3, "matcher(...)");
                                                            z12 = false;
                                                            if (matcher3.find(0)) {
                                                                o0Var2 = new o0(matcher3, str7);
                                                            } else {
                                                                o0Var2 = null;
                                                            }
                                                            if (o0Var2 != null) {
                                                                String upperCase = ((String) ((e) o0Var2.h()).get(1)).toUpperCase(Locale.ROOT);
                                                                i.d(upperCase, "toUpperCase(...)");
                                                                str10 = upperCase;
                                                            }
                                                            str8 = str7;
                                                            arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                                        }
                                                        str10 = null;
                                                        str8 = str7;
                                                        arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                                    } else {
                                                        str8 = str7;
                                                        z12 = false;
                                                    }
                                                    i11 = jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1;
                                                    z10 = z12;
                                                    str13 = str5;
                                                    str16 = str8;
                                                    str15 = str6;
                                                }
                                                str6 = str15;
                                                str7 = str16;
                                                if (hashSet.add(str4 + ':' + iIntValue + ':' + str7)) {
                                                    StringBuilder sb3 = new StringBuilder("parse '");
                                                    sb3.append(str12);
                                                    sb3.append("' → ");
                                                    sb3.append(str4);
                                                    sb3.append(':');
                                                    sb3.append(iIntValue);
                                                    sb3.append(" tipo=");
                                                    sb3.append(i10);
                                                    sb3.append(" user='");
                                                    sb3.append(str7);
                                                    sb3.append("' pass=");
                                                    if (str6.length() == 0) {
                                                        str9 = "—";
                                                    } else {
                                                        str9 = "***";
                                                    }
                                                    sb3.append(str9);
                                                    Log.d("KRYPT-PROXY", sb3.toString());
                                                    if (i10 == -1) {
                                                        i12 = 0;
                                                    } else {
                                                        i12 = i10;
                                                    }
                                                    i.e(str7, "user");
                                                    if (str7.length() == 0) {
                                                        z12 = false;
                                                    } else {
                                                        Pattern patternCompile4 = Pattern.compile("(?i)__cr\\.([a-z]{2})");
                                                        i.d(patternCompile4, "compile(...)");
                                                        matcher3 = patternCompile4.matcher(str7);
                                                        i.d(matcher3, "matcher(...)");
                                                        z12 = false;
                                                        if (matcher3.find(0)) {
                                                            o0Var2 = null;
                                                        } else {
                                                            o0Var2 = new o0(matcher3, str7);
                                                        }
                                                        if (o0Var2 != null) {
                                                            String upperCase2 = ((String) ((e) o0Var2.h()).get(1)).toUpperCase(Locale.ROOT);
                                                            i.d(upperCase2, "toUpperCase(...)");
                                                            str10 = upperCase2;
                                                        }
                                                        str8 = str7;
                                                        arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                                    }
                                                    str10 = null;
                                                    str8 = str7;
                                                    arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                                } else {
                                                    str8 = str7;
                                                    z12 = false;
                                                }
                                                i11 = jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1;
                                                z10 = z12;
                                                str13 = str5;
                                                str16 = str8;
                                                str15 = str6;
                                            }
                                            string2 = string2;
                                            str6 = str15;
                                            str7 = str16;
                                            if (hashSet.add(str4 + ':' + iIntValue + ':' + str7)) {
                                                StringBuilder sb4 = new StringBuilder("parse '");
                                                sb4.append(str12);
                                                sb4.append("' → ");
                                                sb4.append(str4);
                                                sb4.append(':');
                                                sb4.append(iIntValue);
                                                sb4.append(" tipo=");
                                                sb4.append(i10);
                                                sb4.append(" user='");
                                                sb4.append(str7);
                                                sb4.append("' pass=");
                                                if (str6.length() == 0) {
                                                    str9 = "—";
                                                } else {
                                                    str9 = "***";
                                                }
                                                sb4.append(str9);
                                                Log.d("KRYPT-PROXY", sb4.toString());
                                                if (i10 == -1) {
                                                    i12 = 0;
                                                } else {
                                                    i12 = i10;
                                                }
                                                i.e(str7, "user");
                                                if (str7.length() == 0) {
                                                    z12 = false;
                                                } else {
                                                    Pattern patternCompile5 = Pattern.compile("(?i)__cr\\.([a-z]{2})");
                                                    i.d(patternCompile5, "compile(...)");
                                                    matcher3 = patternCompile5.matcher(str7);
                                                    i.d(matcher3, "matcher(...)");
                                                    z12 = false;
                                                    if (matcher3.find(0)) {
                                                        o0Var2 = null;
                                                    } else {
                                                        o0Var2 = new o0(matcher3, str7);
                                                    }
                                                    if (o0Var2 != null) {
                                                        String upperCase3 = ((String) ((e) o0Var2.h()).get(1)).toUpperCase(Locale.ROOT);
                                                        i.d(upperCase3, "toUpperCase(...)");
                                                        str10 = upperCase3;
                                                    }
                                                    str8 = str7;
                                                    arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                                }
                                                str10 = null;
                                                str8 = str7;
                                                arrayList4.add(new n3.c(i12, iIntValue, 768, str4, str8, str6, (String) null, (String) null, str10, false));
                                            } else {
                                                str8 = str7;
                                                z12 = false;
                                            }
                                            i11 = jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1;
                                            z10 = z12;
                                            str13 = str5;
                                            str16 = str8;
                                            str15 = str6;
                                        }
                                        string2 = string2;
                                    }
                                }
                            }
                            size = arrayList4.size();
                            i13 = 0;
                            while (i13 < size) {
                                Object obj3 = arrayList4.get(i13);
                                i13++;
                                arrayList2.add((n3.c) obj3);
                            }
                            it2 = it;
                            dVar2 = dVar;
                            str11 = str;
                            z13 = true;
                        }
                        i10 = 2;
                        string2 = g.B0(string5).toString();
                        if (string2.length() == 0) {
                            dVar = dVar2;
                            str = str11;
                            iN0 = g.n0(string2, '@', 0, 6);
                            if (iN0 > 0) {
                                strSubstring = string2.substring(0, iN0);
                                i.d(strSubstring, "substring(...)");
                                if (g.g0(strSubstring, ':')) {
                                    listV0 = g.v0(strSubstring, new char[]{':'}, 2);
                                    String str17 = (String) listV0.get(0);
                                    if (1 < listV0.size()) {
                                        obj = listV0.get(1);
                                    } else {
                                        obj = str;
                                    }
                                    str2 = (String) obj;
                                    string2 = string2.substring(iN0 + 1);
                                    i.d(string2, "substring(...)");
                                    str3 = str17;
                                    z4 = true;
                                } else {
                                    str2 = str;
                                    str3 = str2;
                                    z4 = false;
                                }
                            } else {
                                str2 = str;
                                str3 = str2;
                                z4 = false;
                            }
                            if (string2.length() != 0) {
                                String str18 = str2;
                                boolean z15 = z4;
                                String str19 = str3;
                                i11 = 0;
                                z10 = true;
                                while (true) {
                                    pc.f fVar4 = d.f7253a;
                                    fVar4.getClass();
                                    matcher = fVar4.f7863a.matcher(string2);
                                    z11 = z10;
                                    i.d(matcher, "matcher(...)");
                                    if (matcher.find(i11)) {
                                        o0Var = null;
                                    } else {
                                        o0Var = new o0(matcher, string2);
                                    }
                                    if (o0Var == null) {
                                        break;
                                        break;
                                    }
                                    matcher2 = (Matcher) o0Var.f5061b;
                                    o0 o0Var4 = o0Var;
                                    str4 = (String) ((e) o0Var.h()).get(1);
                                    numY = n.Y((String) ((e) o0Var4.h()).get(2));
                                    if (numY != null) {
                                        iIntValue = numY.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    if (g.f0(str4, "..", false)) {
                                    }
                                    i11 = jd.d.L(matcher2.start(), matcher2.end()).f7107b + 1;
                                    z10 = z11;
                                    str13 = str13;
                                    string2 = string2;
                                }
                            }
                        }
                        size = arrayList4.size();
                        i13 = 0;
                        while (i13 < size) {
                            Object obj4 = arrayList4.get(i13);
                            i13++;
                            arrayList2.add((n3.c) obj4);
                        }
                        it2 = it;
                        dVar2 = dVar;
                        str11 = str;
                        z13 = true;
                    }
                    dVar = dVar2;
                    str = str11;
                    size = arrayList4.size();
                    i13 = 0;
                    while (i13 < size) {
                        Object obj5 = arrayList4.get(i13);
                        i13++;
                        arrayList2.add((n3.c) obj5);
                    }
                    it2 = it;
                    dVar2 = dVar;
                    str11 = str;
                    z13 = true;
                }
            }
        }
        ArrayList arrayList6 = new ArrayList(k.U(arrayList2));
        int size2 = arrayList2.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj6 = arrayList2.get(i17);
            i17++;
            arrayList6.add(new b1((n3.c) obj6));
        }
        arrayList.addAll(arrayList6);
        TextView textView = cVar.f5665j;
        if (arrayList.isEmpty()) {
            wVar2 = wVar;
            string = "";
        } else {
            wVar2 = wVar;
            string = wVar2.getString(R.string.proxy_import_detected, Integer.valueOf(arrayList.size()));
            i.d(string, "getString(...)");
        }
        textView.setText(string);
        HorizontalScrollView horizontalScrollView = cVar.f5661c;
        if (!arrayList.isEmpty() && !arrayList.isEmpty()) {
            int size3 = arrayList.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size3) {
                    i = 8;
                    break;
                }
                Object obj7 = arrayList.get(i18);
                i18++;
                n3.c cVar2 = ((b1) obj7).f6523a;
                String str20 = cVar2.f7250f;
                if (str20 == null) {
                    str20 = cVar2.h;
                }
                if (str20 != null) {
                    i = 0;
                    break;
                }
            }
        } else {
            i = 8;
            break;
        }
        horizontalScrollView.setVisibility(i);
        qVar.f5776a = null;
        A(cVar, wVar2, arrayList, qVar, a1Var);
        Button buttonB = fVar.b(-1);
        if (buttonB != null) {
            buttonB.setEnabled(!arrayList.isEmpty());
        }
    }

    public static final ArrayList G(q qVar, ArrayList arrayList) {
        if (qVar.f5776a == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n3.c cVar = ((b1) obj).f6523a;
            String str = cVar.f7250f;
            if (str == null) {
                str = cVar.h;
            }
            if (i.a(str, qVar.f5776a)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static void H(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzfkq I(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return zzfkq.SCAR_REQUEST_TYPE_ADMOB;
                }
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return zzfkq.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return zzfkq.SCAR_REQUEST_TYPE_GBID;
                }
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return zzfkq.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return zzfkq.SCAR_REQUEST_TYPE_YAVIN;
                }
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return zzfkq.SCAR_REQUEST_TYPE_UNITY;
                }
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return zzfkq.SCAR_REQUEST_TYPE_PAW;
                }
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return zzfkq.SCAR_REQUEST_TYPE_GUILDER;
                }
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return zzfkq.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                break;
        }
        return zzfkq.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static zzaic J(v9.d dVar, String str) {
        if (v9.q.class.isAssignableFrom(dVar.getClass())) {
            v9.q qVar = (v9.q) dVar;
            return new zzaic(qVar.f9275a, qVar.f9276b, "google.com", null, null, null, str, null, null);
        }
        if (v9.f.class.isAssignableFrom(dVar.getClass())) {
            return new zzaic(null, ((v9.f) dVar).f9243a, "facebook.com", null, null, null, str, null, null);
        }
        if (b0.class.isAssignableFrom(dVar.getClass())) {
            b0 b0Var = (b0) dVar;
            return new zzaic(null, b0Var.f9225a, "twitter.com", null, b0Var.f9226b, null, str, null, null);
        }
        if (v9.p.class.isAssignableFrom(dVar.getClass())) {
            return new zzaic(null, ((v9.p) dVar).f9274a, "github.com", null, null, null, str, null, null);
        }
        if (y.class.isAssignableFrom(dVar.getClass())) {
            return new zzaic(null, null, "playgames.google.com", null, null, ((y) dVar).f9285a, str, null, null);
        }
        if (!h0.class.isAssignableFrom(dVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        h0 h0Var = (h0) dVar;
        zzaic zzaicVar = h0Var.f9251d;
        return zzaicVar != null ? zzaicVar : new zzaic(h0Var.f9249b, h0Var.f9250c, h0Var.f9248a, null, h0Var.f9252f, null, str, h0Var.e, h0Var.f9253r);
    }

    public static void K(Context context) {
        boolean z4;
        Object obj = i6.g.f5227b;
        if (((Boolean) zzbej.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (i6.g.f5227b) {
                        z4 = i6.g.f5228c;
                    }
                    if (z4) {
                        return;
                    }
                    m9.a aVarZzb = new g6.h(context).zzb();
                    i6.h.f("Updating ad debug logging enablement.");
                    zzcam.zza(aVarZzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                i6.h.h("Fail to determine debug setting.", e);
            }
        }
    }

    public static String L(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String M(o3 o3Var) {
        Bundle bundle;
        return (o3Var == null || (bundle = o3Var.f3373c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void N(zzdsr zzdsrVar, String str, Pair... pairArr) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzgO)).booleanValue()) {
            zzcaj.zza.execute(new b3.b(zzdsrVar, str, pairArr, 13, false));
        }
    }

    public static int O(zzffo zzffoVar) {
        if (zzffoVar.zzr) {
            return 2;
        }
        o3 o3Var = zzffoVar.zzd;
        e6.o0 o0Var = o3Var.D;
        String str = o3Var.I;
        if (o0Var == null && str == null) {
            return 1;
        }
        if (o0Var == null || str == null) {
            return o0Var != null ? 3 : 4;
        }
        return 5;
    }

    public static final void a(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("?");
            if (i10 < i - 1) {
                sb2.append(",");
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int i = 0;
        while (i < str.length()) {
            int iIndexOf = str.indexOf(str2, i);
            int length = str2.length() + iIndexOf;
            if (iIndexOf == -1 || length > str.length()) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, length, 17);
            i = length + 1;
        }
    }

    public static void c(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new mc.e(2, 36, 1));
        }
    }

    public static bb.b d(String str, bd.q qVar) {
        Charset charset = pc.a.f7846a;
        Pattern pattern = bd.q.f1632c;
        Charset charsetA = qVar.a(null);
        if (charsetA == null) {
            String str2 = qVar + "; charset=utf-8";
            i.e(str2, "<this>");
            try {
                qVar = r7.g.q(str2);
            } catch (IllegalArgumentException unused) {
                qVar = null;
            }
        } else {
            charset = charsetA;
        }
        byte[] bytes = str.getBytes(charset);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        cd.b.c(bytes.length, 0, length);
        return new bb.b(qVar, length, bytes);
    }

    public static int e(Activity activity, int i) {
        return (int) (i * activity.getResources().getDisplayMetrics().density);
    }

    public static final boolean f(char c10, char c11, boolean z4) {
        if (c10 == c11) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static ColorStateList g(Context context, a2.l lVar, int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) lVar.f44c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.k.getColorStateList(context, resourceId)) == null) ? lVar.t(i) : colorStateList;
    }

    public static ColorStateList h(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateList;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = e0.k.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public static int i(Context context, TypedArray typedArray, int i, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableR;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableR = com.bumptech.glide.d.r(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableR;
    }

    public static float k(int i, String[] strArr) {
        float f10 = Float.parseFloat(strArr[i]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static final d1.d l(String str) {
        i.e(str, "name");
        return new d1.d(str);
    }

    public static boolean m(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean n(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean o(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static q3.b p(q3.h hVar) {
        long j4;
        boolean z4;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = hVar.f7999c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jR = str != null ? r(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z4 = false;
            j10 = 0;
            j11 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z4 = true;
                }
                i++;
            }
            j4 = 0;
            i = 1;
        } else {
            j4 = 0;
            z4 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jR2 = str3 != null ? r(str3) : j4;
        String str4 = (String) map.get("Last-Modified");
        long jR3 = str4 != null ? r(str4) : j4;
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j14 = (j10 * 1000) + jCurrentTimeMillis;
            j13 = z4 ? j14 : (j11 * 1000) + j14;
            j12 = j14;
        } else {
            j12 = (jR <= j4 || jR2 < jR) ? j4 : (jR2 - jR) + jCurrentTimeMillis;
            j13 = j12;
        }
        q3.b bVar = new q3.b();
        bVar.f7978a = hVar.f7998b;
        bVar.f7979b = str5;
        bVar.f7982f = j12;
        bVar.e = j13;
        bVar.f7980c = jR;
        bVar.f7981d = jR3;
        bVar.f7983g = map;
        bVar.h = hVar.f8000d;
        return bVar;
    }

    public static String q(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long r(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                q3.q.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", q3.q.a("Unable to parse dateStr: %s, falling back to 0", str), e);
            return 0L;
        }
    }

    public static void s(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e) {
                H(cls, e);
                throw null;
            } catch (InstantiationException e4) {
                H(cls, e4);
                throw null;
            } catch (NoSuchMethodException e10) {
                H(cls, e10);
                throw null;
            } catch (InvocationTargetException e11) {
                H(cls, e11);
                throw null;
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    public static HashMap t(Uri uri) {
        HashMap map = new HashMap();
        try {
            for (String str : uri.getQueryParameterNames()) {
                if (str.equalsIgnoreCase("link") || str.equalsIgnoreCase("continueUrl")) {
                    map.putAll(t(Uri.parse(uri.getQueryParameter(str))));
                } else {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null) {
                        map.put(str, queryParameter);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    public static final boolean u(String str) {
        i.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static int v(Context context, int i, int i10) {
        TypedValue typedValueL = a.a.l(context, i);
        return (typedValueL == null || typedValueL.type != 16) ? i10 : typedValueL.data;
    }

    public static TimeInterpolator w(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!n(strValueOf, "cubic-bezier") && !n(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (n(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return s0.a.b(k(0, strArrSplit), k(1, strArrSplit), k(2, strArrSplit), k(3, strArrSplit));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!n(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        h0.f[] fVarArrO = c1.o(strSubstring);
        if (fVarArrO != null) {
            try {
                h0.f.b(fVarArrO, path);
            } catch (RuntimeException e) {
                throw new RuntimeException(u3.b.b("Error in parsing ", strSubstring), e);
            }
        } else {
            path = null;
        }
        return s0.a.c(path);
    }

    public static void x(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((b1) obj).f6524b == 2) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            b1 b1Var = (b1) obj2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("t", b1Var.f6523a.f7246a);
            jSONObject.put("h", b1Var.f6523a.f7247b);
            jSONObject.put("p", b1Var.f6523a.f7248c);
            jSONObject.put("u", b1Var.f6523a.f7249d);
            jSONObject.put("w", b1Var.f6523a.e);
            String str = b1Var.f6523a.f7250f;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("c", str);
            String str3 = b1Var.f6523a.h;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("cl", str3);
            String str4 = b1Var.f6523a.f7251g;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("ip", str2);
            jSONObject.put("v", b1Var.f6523a.i);
            jSONObject.put("ms", b1Var.f6525c);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        i.d(string, "toString(...)");
        SharedPreferences sharedPreferences = i3.p.f5195a;
        if (sharedPreferences == null) {
            throw new IllegalStateException("Prefs.init(context) no llamado");
        }
        sharedPreferences.edit().putString("proxy_verified", string).apply();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0193  */
    /* JADX WARN: Code duplicated, block: B:50:0x0196  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0209  */
    /* JADX WARN: Code duplicated, block: B:67:0x0216  */
    /* JADX WARN: Code duplicated, block: B:69:0x0223  */
    /* JADX WARN: Code duplicated, block: B:71:0x0230  */
    /* JADX WARN: Code duplicated, block: B:73:0x023d  */
    /* JADX WARN: Code duplicated, block: B:75:0x024a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0257  */
    /* JADX WARN: Code duplicated, block: B:79:0x0264  */
    /* JADX WARN: Code duplicated, block: B:81:0x0271  */
    /* JADX WARN: Code duplicated, block: B:83:0x027e  */
    /* JADX WARN: Code duplicated, block: B:85:0x02da  */
    /* JADX WARN: Code duplicated, block: B:86:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0403  */
    /* JADX WARN: Code duplicated, block: B:90:0x0416  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x02dd, please report this as an issue */
    public static void y(final w wVar, ic.a aVar) {
        String str;
        vb.q qVar;
        o oVar;
        Object objM;
        Object obj;
        final ArrayList arrayList;
        View viewInflate;
        int i;
        TextView textView;
        EditText editText;
        HorizontalScrollView horizontalScrollView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        ProgressBar progressBar;
        RecyclerView recyclerView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        final c cVar;
        final o oVar2;
        final f fVarA;
        final a1 a1Var;
        String str2;
        final String str3;
        final o oVar3;
        vb.q qVar2 = vb.q.f9297a;
        if (wVar.isFinishing() || wVar.isDestroyed()) {
            return;
        }
        o oVar4 = new o();
        final o oVar5 = new o();
        o oVar6 = new o();
        final q qVar3 = new q();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final q qVar4 = new q();
        qVar4.f5776a = qVar2;
        final ArrayList arrayList2 = new ArrayList();
        String str4 = "optString(...)";
        try {
            SharedPreferences sharedPreferences = i3.p.f5195a;
            try {
                if (sharedPreferences == null) {
                    throw new IllegalStateException("Prefs.init(context) no llamado");
                }
                String string = sharedPreferences.getString("proxy_verified", "");
                if (string == null) {
                    string = "";
                }
                JSONArray jSONArray = new JSONArray(string);
                mc.e eVarL = jd.d.L(0, jSONArray.length());
                str = "";
                try {
                    ArrayList arrayList3 = new ArrayList(k.U(eVarL));
                    Iterator it = eVarL.iterator();
                    while (((mc.b) it).f7105d) {
                        JSONObject jSONObject = jSONArray.getJSONObject(((mc.b) it).nextInt());
                        Iterator it2 = it;
                        String strOptString = jSONObject.optString("c");
                        qVar = qVar2;
                        try {
                            Pattern patternCompile = Pattern.compile("[A-Za-z]{2}");
                            i.d(patternCompile, "compile(...)");
                            i.b(strOptString);
                            String str5 = patternCompile.matcher(strOptString).matches() ? strOptString : null;
                            String strOptString2 = jSONObject.optString("cl");
                            Pattern patternCompile2 = Pattern.compile("[A-Za-z]{2}");
                            i.d(patternCompile2, "compile(...)");
                            i.b(strOptString2);
                            String str6 = patternCompile2.matcher(strOptString2).matches() ? strOptString2 : null;
                            int iOptInt = jSONObject.optInt("t");
                            String string2 = jSONObject.getString("h");
                            i.d(string2, "getString(...)");
                            int i10 = jSONObject.getInt("p");
                            String strOptString3 = jSONObject.optString("u");
                            i.d(strOptString3, str4);
                            String strOptString4 = jSONObject.optString("w");
                            i.d(strOptString4, str4);
                            String str7 = str4;
                            String strOptString5 = jSONObject.optString("ip");
                            b1 b1Var = new b1(new n3.c(iOptInt, i10, 512, string2, strOptString3, strOptString4, str5, strOptString5.length() == 0 ? null : strOptString5, str6, jSONObject.optBoolean("v", false)));
                            b1Var.f6524b = 2;
                            o oVar7 = oVar4;
                            b1Var.f6525c = jSONObject.optLong("ms");
                            arrayList3.add(b1Var);
                            it = it2;
                            str4 = str7;
                            qVar2 = qVar;
                            oVar4 = oVar7;
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                    qVar = qVar2;
                    oVar = oVar4;
                    Log.d("KRYPT-PROXY", "cargados " + arrayList3.size() + " verificados: " + vb.i.e0(arrayList3, null, null, null, new h3.o(14), 31));
                    objM = arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    qVar = qVar2;
                }
                if (objM instanceof ub.g) {
                    obj = qVar;
                } else {
                    obj = objM;
                }
                arrayList2.addAll((List) obj);
                arrayList = new ArrayList();
                viewInflate = wVar.getLayoutInflater().inflate(R.layout.dialog_proxy_list, (ViewGroup) null, false);
                i = R.id.btn_empty_add;
                textView = (TextView) r7.g.o(viewInflate, R.id.btn_empty_add);
                if (textView != null) {
                    i = R.id.et_list;
                    editText = (EditText) r7.g.o(viewInflate, R.id.et_list);
                    if (editText != null) {
                        i = R.id.hl_countries;
                        horizontalScrollView = (HorizontalScrollView) r7.g.o(viewInflate, R.id.hl_countries);
                        if (horizontalScrollView != null) {
                            i = R.id.ll_countries;
                            linearLayout = (LinearLayout) r7.g.o(viewInflate, R.id.ll_countries);
                            if (linearLayout != null) {
                                i = R.id.ll_empty;
                                linearLayout2 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_empty);
                                if (linearLayout2 != null) {
                                    i = R.id.ll_links;
                                    linearLayout3 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_links);
                                    if (linearLayout3 != null) {
                                        i = R.id.pb_list;
                                        progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.pb_list);
                                        if (progressBar != null) {
                                            i = R.id.rv_results;
                                            recyclerView = (RecyclerView) r7.g.o(viewInflate, R.id.rv_results);
                                            if (recyclerView != null) {
                                                i = R.id.tv_clear;
                                                textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_clear);
                                                if (textView2 != null) {
                                                    i = R.id.tv_detected;
                                                    textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_detected);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_empty_msg;
                                                        textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_empty_msg);
                                                        if (textView4 != null) {
                                                            i = R.id.tv_manual;
                                                            textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_manual);
                                                            if (textView5 != null) {
                                                                i = R.id.tv_new_list;
                                                                textView6 = (TextView) r7.g.o(viewInflate, R.id.tv_new_list);
                                                                if (textView6 != null) {
                                                                    i = R.id.tv_progress;
                                                                    textView7 = (TextView) r7.g.o(viewInflate, R.id.tv_progress);
                                                                    if (textView7 != null) {
                                                                        i = R.id.tv_retest;
                                                                        textView8 = (TextView) r7.g.o(viewInflate, R.id.tv_retest);
                                                                        if (textView8 != null) {
                                                                            i = R.id.tv_retest_fails;
                                                                            textView9 = (TextView) r7.g.o(viewInflate, R.id.tv_retest_fails);
                                                                            if (textView9 != null) {
                                                                                LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                                cVar = new c(linearLayout4, textView, editText, horizontalScrollView, linearLayout, linearLayout2, linearLayout3, progressBar, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                oVar2 = new o();
                                                                                ea.j jVar = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                                                                                jVar.l(R.string.add_proxies);
                                                                                ((g.b) jVar.f3530b).f3983s = linearLayout4;
                                                                                jVar.j(R.string.proxy_import_test, null);
                                                                                jVar.g(R.string.proxy_close, null);
                                                                                fVarA = jVar.a();
                                                                                fVarA.setCanceledOnTouchOutside(false);
                                                                                a1Var = new a1(wVar);
                                                                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                                                                recyclerView.setAdapter(a1Var);
                                                                                if (g.m0(i3.p.c())) {
                                                                                    str2 = str;
                                                                                } else {
                                                                                    str2 = i3.p.c() + ':' + i3.p.b().getInt("proxy_port", 0) + ':' + i3.p.d();
                                                                                }
                                                                                i.e(str2, "<set-?>");
                                                                                a1Var.f6516g = str2;
                                                                                str3 = str2;
                                                                                oVar3 = oVar;
                                                                                a1Var.f6515f = new h3.o(oVar3, a1Var, wVar, arrayList2, oVar6, fVarA, aVar);
                                                                                editText.addTextChangedListener(new l3.c1(oVar3, oVar5, arrayList, cVar, wVar, qVar3, fVarA, a1Var));
                                                                                textView5.setOnClickListener(new d0(oVar3, wVar, arrayList2, oVar6, fVarA, aVar));
                                                                                textView6.setOnClickListener(new p0(oVar3, oVar5, cVar, fVarA, wVar, oVar2, a1Var, arrayList, qVar3));
                                                                                a1Var.i = new u0(oVar3, wVar, arrayList2, qVar4, oVar5, oVar2, a1Var, cVar, fVarA, arrayList, qVar3, str3);
                                                                                textView8.setOnClickListener(new r0(oVar3, arrayList2, arrayList, wVar, oVar5, atomicBoolean, cVar, a1Var, fVarA, qVar3, qVar4, oVar2, str3));
                                                                                cVar.f5670o.setOnClickListener(new r0(oVar3, qVar4, arrayList, arrayList2, wVar, oVar5, atomicBoolean, cVar, a1Var, fVarA, qVar3, oVar2, str3));
                                                                                cVar.i.setOnClickListener(new View.OnClickListener() { // from class: l3.v0
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view) {
                                                                                        jc.o oVar8 = oVar3;
                                                                                        if (oVar8.f5774a) {
                                                                                            return;
                                                                                        }
                                                                                        arrayList2.clear();
                                                                                        SharedPreferences sharedPreferences2 = i3.p.f5195a;
                                                                                        if (sharedPreferences2 == null) {
                                                                                            throw new IllegalStateException("Prefs.init(context) no llamado");
                                                                                        }
                                                                                        sharedPreferences2.edit().putString("proxy_verified", "").apply();
                                                                                        androidx.fragment.app.w wVar2 = wVar;
                                                                                        Toast.makeText(wVar2, R.string.proxy_import_cleared, 0).show();
                                                                                        android.support.v4.media.session.a.C(cVar, oVar5, oVar8, fVarA, wVar2, oVar2, a1Var, arrayList, qVar3);
                                                                                    }
                                                                                });
                                                                                fVarA.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l3.w0
                                                                                    @Override // android.content.DialogInterface.OnShowListener
                                                                                    public final void onShow(DialogInterface dialogInterface) {
                                                                                        g.f fVar = fVarA;
                                                                                        fVar.b(-1).setEnabled(false);
                                                                                        Button buttonB = fVar.b(-1);
                                                                                        jc.o oVar8 = oVar3;
                                                                                        jc.o oVar9 = oVar5;
                                                                                        ArrayList arrayList4 = arrayList;
                                                                                        ArrayList arrayList5 = arrayList2;
                                                                                        androidx.fragment.app.w wVar2 = wVar;
                                                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                        j3.c cVar2 = cVar;
                                                                                        a1 a1Var2 = a1Var;
                                                                                        jc.q qVar5 = qVar3;
                                                                                        jc.q qVar6 = qVar4;
                                                                                        jc.o oVar10 = oVar2;
                                                                                        String str8 = str3;
                                                                                        buttonB.setOnClickListener(new r0(oVar8, oVar9, arrayList4, arrayList5, wVar2, atomicBoolean2, cVar2, a1Var2, fVar, qVar5, qVar6, oVar10, str8));
                                                                                        fVar.b(-2).setOnClickListener(new r0(fVar, oVar8, atomicBoolean2, wVar2, oVar10, arrayList5, oVar9, qVar5, arrayList4, cVar2, qVar6, a1Var2, str8));
                                                                                    }
                                                                                });
                                                                                fVarA.setOnDismissListener(new x0());
                                                                                fVarA.show();
                                                                                if (arrayList2.isEmpty()) {
                                                                                    C(cVar, oVar5, oVar3, fVarA, wVar, oVar2, a1Var, arrayList, qVar3);
                                                                                    return;
                                                                                } else {
                                                                                    D(oVar5, oVar3, oVar2, qVar3, arrayList, arrayList2, cVar, true, qVar4, wVar, a1Var, fVarA, str3);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            } catch (Throwable th3) {
                th = th3;
                objM = r7.g.m(th);
            }
        } catch (Throwable th4) {
            th = th4;
            str = "";
        }
        qVar = qVar2;
        oVar = oVar4;
        objM = r7.g.m(th);
        if (objM instanceof ub.g) {
            obj = qVar;
        } else {
            obj = objM;
        }
        arrayList2.addAll((List) obj);
        arrayList = new ArrayList();
        viewInflate = wVar.getLayoutInflater().inflate(R.layout.dialog_proxy_list, (ViewGroup) null, false);
        i = R.id.btn_empty_add;
        textView = (TextView) r7.g.o(viewInflate, R.id.btn_empty_add);
        if (textView != null) {
            i = R.id.et_list;
            editText = (EditText) r7.g.o(viewInflate, R.id.et_list);
            if (editText != null) {
                i = R.id.hl_countries;
                horizontalScrollView = (HorizontalScrollView) r7.g.o(viewInflate, R.id.hl_countries);
                if (horizontalScrollView != null) {
                    i = R.id.ll_countries;
                    linearLayout = (LinearLayout) r7.g.o(viewInflate, R.id.ll_countries);
                    if (linearLayout != null) {
                        i = R.id.ll_empty;
                        linearLayout2 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_empty);
                        if (linearLayout2 != null) {
                            i = R.id.ll_links;
                            linearLayout3 = (LinearLayout) r7.g.o(viewInflate, R.id.ll_links);
                            if (linearLayout3 != null) {
                                i = R.id.pb_list;
                                progressBar = (ProgressBar) r7.g.o(viewInflate, R.id.pb_list);
                                if (progressBar != null) {
                                    i = R.id.rv_results;
                                    recyclerView = (RecyclerView) r7.g.o(viewInflate, R.id.rv_results);
                                    if (recyclerView != null) {
                                        i = R.id.tv_clear;
                                        textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_clear);
                                        if (textView2 != null) {
                                            i = R.id.tv_detected;
                                            textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_detected);
                                            if (textView3 != null) {
                                                i = R.id.tv_empty_msg;
                                                textView4 = (TextView) r7.g.o(viewInflate, R.id.tv_empty_msg);
                                                if (textView4 != null) {
                                                    i = R.id.tv_manual;
                                                    textView5 = (TextView) r7.g.o(viewInflate, R.id.tv_manual);
                                                    if (textView5 != null) {
                                                        i = R.id.tv_new_list;
                                                        textView6 = (TextView) r7.g.o(viewInflate, R.id.tv_new_list);
                                                        if (textView6 != null) {
                                                            i = R.id.tv_progress;
                                                            textView7 = (TextView) r7.g.o(viewInflate, R.id.tv_progress);
                                                            if (textView7 != null) {
                                                                i = R.id.tv_retest;
                                                                textView8 = (TextView) r7.g.o(viewInflate, R.id.tv_retest);
                                                                if (textView8 != null) {
                                                                    i = R.id.tv_retest_fails;
                                                                    textView9 = (TextView) r7.g.o(viewInflate, R.id.tv_retest_fails);
                                                                    if (textView9 != null) {
                                                                        LinearLayout linearLayout5 = (LinearLayout) viewInflate;
                                                                        cVar = new c(linearLayout5, textView, editText, horizontalScrollView, linearLayout, linearLayout2, linearLayout3, progressBar, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                        oVar2 = new o();
                                                                        ea.j jVar2 = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                                                                        jVar2.l(R.string.add_proxies);
                                                                        ((g.b) jVar2.f3530b).f3983s = linearLayout5;
                                                                        jVar2.j(R.string.proxy_import_test, null);
                                                                        jVar2.g(R.string.proxy_close, null);
                                                                        fVarA = jVar2.a();
                                                                        fVarA.setCanceledOnTouchOutside(false);
                                                                        a1Var = new a1(wVar);
                                                                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                                                        recyclerView.setAdapter(a1Var);
                                                                        if (g.m0(i3.p.c())) {
                                                                            str2 = str;
                                                                        } else {
                                                                            str2 = i3.p.c() + ':' + i3.p.b().getInt("proxy_port", 0) + ':' + i3.p.d();
                                                                        }
                                                                        i.e(str2, "<set-?>");
                                                                        a1Var.f6516g = str2;
                                                                        str3 = str2;
                                                                        oVar3 = oVar;
                                                                        a1Var.f6515f = new h3.o(oVar3, a1Var, wVar, arrayList2, oVar6, fVarA, aVar);
                                                                        editText.addTextChangedListener(new l3.c1(oVar3, oVar5, arrayList, cVar, wVar, qVar3, fVarA, a1Var));
                                                                        textView5.setOnClickListener(new d0(oVar3, wVar, arrayList2, oVar6, fVarA, aVar));
                                                                        textView6.setOnClickListener(new p0(oVar3, oVar5, cVar, fVarA, wVar, oVar2, a1Var, arrayList, qVar3));
                                                                        a1Var.i = new u0(oVar3, wVar, arrayList2, qVar4, oVar5, oVar2, a1Var, cVar, fVarA, arrayList, qVar3, str3);
                                                                        textView8.setOnClickListener(new r0(oVar3, arrayList2, arrayList, wVar, oVar5, atomicBoolean, cVar, a1Var, fVarA, qVar3, qVar4, oVar2, str3));
                                                                        cVar.f5670o.setOnClickListener(new r0(oVar3, qVar4, arrayList, arrayList2, wVar, oVar5, atomicBoolean, cVar, a1Var, fVarA, qVar3, oVar2, str3));
                                                                        cVar.i.setOnClickListener(new View.OnClickListener() { // from class: l3.v0
                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view) {
                                                                                jc.o oVar8 = oVar3;
                                                                                if (oVar8.f5774a) {
                                                                                    return;
                                                                                }
                                                                                arrayList2.clear();
                                                                                SharedPreferences sharedPreferences2 = i3.p.f5195a;
                                                                                if (sharedPreferences2 == null) {
                                                                                    throw new IllegalStateException("Prefs.init(context) no llamado");
                                                                                }
                                                                                sharedPreferences2.edit().putString("proxy_verified", "").apply();
                                                                                androidx.fragment.app.w wVar2 = wVar;
                                                                                Toast.makeText(wVar2, R.string.proxy_import_cleared, 0).show();
                                                                                android.support.v4.media.session.a.C(cVar, oVar5, oVar8, fVarA, wVar2, oVar2, a1Var, arrayList, qVar3);
                                                                            }
                                                                        });
                                                                        fVarA.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l3.w0
                                                                            @Override // android.content.DialogInterface.OnShowListener
                                                                            public final void onShow(DialogInterface dialogInterface) {
                                                                                g.f fVar = fVarA;
                                                                                fVar.b(-1).setEnabled(false);
                                                                                Button buttonB = fVar.b(-1);
                                                                                jc.o oVar8 = oVar3;
                                                                                jc.o oVar9 = oVar5;
                                                                                ArrayList arrayList4 = arrayList;
                                                                                ArrayList arrayList5 = arrayList2;
                                                                                androidx.fragment.app.w wVar2 = wVar;
                                                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                j3.c cVar2 = cVar;
                                                                                a1 a1Var2 = a1Var;
                                                                                jc.q qVar5 = qVar3;
                                                                                jc.q qVar6 = qVar4;
                                                                                jc.o oVar10 = oVar2;
                                                                                String str8 = str3;
                                                                                buttonB.setOnClickListener(new r0(oVar8, oVar9, arrayList4, arrayList5, wVar2, atomicBoolean2, cVar2, a1Var2, fVar, qVar5, qVar6, oVar10, str8));
                                                                                fVar.b(-2).setOnClickListener(new r0(fVar, oVar8, atomicBoolean2, wVar2, oVar10, arrayList5, oVar9, qVar5, arrayList4, cVar2, qVar6, a1Var2, str8));
                                                                            }
                                                                        });
                                                                        fVarA.setOnDismissListener(new x0());
                                                                        fVarA.show();
                                                                        if (arrayList2.isEmpty()) {
                                                                            D(oVar5, oVar3, oVar2, qVar3, arrayList, arrayList2, cVar, true, qVar4, wVar, a1Var, fVarA, str3);
                                                                            return;
                                                                        } else {
                                                                            C(cVar, oVar5, oVar3, fVarA, wVar, oVar2, a1Var, arrayList, qVar3);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static final void z(c cVar, o oVar, o oVar2, f fVar, w wVar, o oVar3, a1 a1Var, ArrayList arrayList, q qVar) {
        oVar.f5774a = false;
        oVar2.f5774a = false;
        cVar.e.setVisibility(8);
        EditText editText = cVar.f5660b;
        editText.setText("");
        editText.setVisibility(0);
        TextView textView = cVar.f5665j;
        textView.setVisibility(0);
        textView.setText("");
        cVar.h.setVisibility(8);
        cVar.f5664g.setVisibility(8);
        cVar.f5668m.setVisibility(8);
        cVar.f5661c.setVisibility(8);
        cVar.f5663f.setVisibility(0);
        cVar.f5666k.setVisibility(8);
        cVar.f5667l.setVisibility(8);
        cVar.f5669n.setVisibility(8);
        cVar.f5670o.setVisibility(8);
        cVar.i.setVisibility(8);
        Button buttonB = fVar.b(-1);
        buttonB.setVisibility(0);
        buttonB.setText(wVar.getString(R.string.proxy_import_test));
        buttonB.setEnabled(false);
        oVar3.f5774a = true;
        Button buttonB2 = fVar.b(-2);
        if (buttonB2 != null) {
            buttonB2.setText(wVar.getString(R.string.proxy_back));
        }
        a1Var.h = false;
        F(arrayList, cVar, wVar, qVar, fVar, a1Var);
    }
}
