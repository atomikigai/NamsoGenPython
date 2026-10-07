package jd;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bd.u;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.z0;
import q0.g1;
import q0.h1;
import u0.o;
import u0.p;
import u0.q;
import u0.r;
import u0.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public d() {
        new ConcurrentHashMap();
    }

    public static List D(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        jc.i.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static int E(mc.e eVar) {
        kc.c cVar = kc.d.f6206a;
        try {
            return l.p(eVar);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static void F(Window window, boolean z4) {
        if (Build.VERSION.SDK_INT >= 30) {
            h1.a(window, z4);
        } else {
            g1.a(window, z4);
        }
    }

    public static void G(TextView textView, int i) {
        qd.b.g(i);
        if (Build.VERSION.SDK_INT >= 28) {
            r.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = u0.n.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void H(TextView textView, int i) {
        qd.b.g(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = u0.n.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i10);
        }
    }

    public static mc.d J(mc.e eVar, int i) {
        jc.i.e(eVar, "<this>");
        boolean z4 = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z4) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i10 = eVar.f7106a;
        int i11 = eVar.f7107b;
        if (eVar.f7108c <= 0) {
            i = -i;
        }
        return new mc.d(i10, i11, i);
    }

    public static final void K(int i, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static mc.e L(int i, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new mc.e(i, i10 - 1, 1);
        }
        mc.e eVar = mc.e.f7109d;
        return mc.e.f7109d;
    }

    public static ActionMode.Callback M(ActionMode.Callback callback) {
        return (!(callback instanceof s) || Build.VERSION.SDK_INT < 26) ? callback : ((s) callback).f8773a;
    }

    public static ActionMode.Callback O(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof s) || callback == null) ? callback : new s(callback, textView);
    }

    public static w5.h[] P(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        w5.h[] hVarArr = new w5.h[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    hVarArr[i] = new w5.h("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                hVarArr[i] = w5.h.h;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                hVarArr[i] = w5.h.f9648j;
            } else if ("FULL_BANNER".equals(strTrim)) {
                hVarArr[i] = w5.h.i;
            } else if ("LEADERBOARD".equals(strTrim)) {
                hVarArr[i] = w5.h.f9649k;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                hVarArr[i] = w5.h.f9650l;
            } else if ("SMART_BANNER".equals(strTrim)) {
                hVarArr[i] = w5.h.f9652n;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                hVarArr[i] = w5.h.f9651m;
            } else if ("FLUID".equals(strTrim)) {
                hVarArr[i] = w5.h.f9653o;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                hVarArr[i] = w5.h.f9655q;
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            k9.k kVar = (k9.k) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", kVar.f6114a);
            bundle.putLong("event_timestamp", kVar.f6115b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static od.e b() throws InterruptedException {
        od.e eVar = od.e.f7730l;
        jc.i.b(eVar);
        od.e eVar2 = eVar.f7731f;
        if (eVar2 == null) {
            long jNanoTime = System.nanoTime();
            od.e.i.await(od.e.f7728j, TimeUnit.MILLISECONDS);
            od.e eVar3 = od.e.f7730l;
            jc.i.b(eVar3);
            if (eVar3.f7731f != null || System.nanoTime() - jNanoTime < od.e.f7729k) {
                return null;
            }
            return od.e.f7730l;
        }
        long jNanoTime2 = eVar2.f7732g - System.nanoTime();
        if (jNanoTime2 > 0) {
            od.e.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        od.e eVar4 = od.e.f7730l;
        jc.i.b(eVar4);
        eVar4.f7731f = eVar2.f7731f;
        eVar2.f7731f = null;
        return eVar2;
    }

    public static wb.c c(wb.c cVar) {
        cVar.k();
        cVar.f9892c = true;
        return cVar.f9891b > 0 ? cVar : wb.c.f9889d;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int g(int i, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(q1.a.j(i10, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            return 0;
        }
        return i > i10 ? i10 : i;
    }

    public static long h(long j4) {
        if (j4 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j4 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j4;
    }

    public static androidx.emoji2.text.s i(Context context) {
        ProviderInfo providerInfo;
        u uVar;
        ApplicationInfo applicationInfo;
        b9.e cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new b9.e(2);
        PackageManager packageManager = context.getPackageManager();
        qd.b.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            uVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrU = cVar.u(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrU) {
                    arrayList.add(signature.toByteArray());
                }
                uVar = new u(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                uVar = null;
            }
        }
        if (uVar == null) {
            return null;
        }
        return new androidx.emoji2.text.s(new androidx.emoji2.text.r(context, uVar));
    }

    public static final long n() {
        return Thread.currentThread().getId();
    }

    public static final void o(g2.a aVar, String str) {
        jc.i.e(aVar, "<this>");
        jc.i.e(str, "sql");
        g2.c cVarR = aVar.R(str);
        try {
            cVarR.O();
            a.a.b(cVarR, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a.b(cVarR, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class s(nc.b bVar) {
        jc.i.e(bVar, "<this>");
        Class clsA = ((jc.d) bVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static o0.d y(z0 z0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new o0.d(r.c(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = p.a(z0Var);
        int iD = p.d(z0Var);
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (z0Var.getInputType() & 15) != 3) {
            boolean z4 = o.b(z0Var) == 1;
            switch (o.c(z0Var)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(r.b(q.a(o.d(z0Var)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new o0.d(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static final int z(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public abstract boolean A(float f10);

    public abstract boolean B(View view);

    public abstract boolean C(float f10, float f11);

    public abstract boolean I(View view, float f10);

    public abstract void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i10);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i);

    public abstract Typeface j(Context context, g0.f fVar, Resources resources, int i);

    public abstract Typeface k(Context context, n0.g[] gVarArr, int i);

    public Typeface l(Context context, InputStream inputStream) {
        File fileL = l.l(context);
        if (fileL == null) {
            return null;
        }
        try {
            if (l.h(fileL, inputStream)) {
                return Typeface.createFromFile(fileL.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileL.delete();
        }
    }

    public Typeface m(Context context, Resources resources, int i, String str, int i10) {
        File fileL = l.l(context);
        if (fileL == null) {
            return null;
        }
        try {
            if (l.g(fileL, resources, i)) {
                return Typeface.createFromFile(fileL.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileL.delete();
        }
    }

    public n0.g p(n0.g[] gVarArr, int i) {
        int i10 = (i & 1) == 0 ? 400 : 700;
        boolean z4 = (i & 2) != 0;
        n0.g gVar = null;
        int i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (n0.g gVar2 : gVarArr) {
            int iAbs = (Math.abs(gVar2.f7146c - i10) * 2) + (gVar2.f7147d == z4 ? 0 : 1);
            if (gVar == null || i11 > iAbs) {
                gVar = gVar2;
                i11 = iAbs;
            }
        }
        return gVar;
    }

    public abstract int q();

    public abstract int r();

    public abstract int t();

    public abstract int u();

    public abstract int v(View view);

    public abstract int w(CoordinatorLayout coordinatorLayout);

    public abstract int x();
}
