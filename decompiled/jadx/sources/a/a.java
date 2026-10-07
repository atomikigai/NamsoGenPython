package a;

import a2.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.fragment.app.w;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import bd.t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.p002firebaseauthapi.zzaha;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import da.v;
import e2.d;
import g2.c;
import gb.r;
import h3.n0;
import h3.s;
import ic.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import n3.i;
import n9.b;
import q3.e;
import r7.g;
import ub.f;
import vb.k;
import vc.h;
import y1.l0;
import yb.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c cVar, Throwable th) {
        boolean zIsTerminated;
        if (cVar != 0) {
            if (th != null) {
                try {
                    v.r(cVar);
                    return;
                } catch (Throwable th2) {
                    p3.a.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (!(cVar instanceof ExecutorService)) {
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                } else if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else {
                    if (!(cVar instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) cVar).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) cVar;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z4 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        executorService.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    public static void c(long j4) {
        String str;
        ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
        Activity activity = (Activity) concurrentHashMap.get(Long.valueOf(j4));
        StringBuilder sbL = v.l("closeWindow #", " → ventana=", j4);
        if (activity != null) {
            str = "viva(" + System.identityHashCode(activity) + ')';
            if (str == null) {
                str = "ninguna";
            }
        } else {
            str = "ninguna";
        }
        sbL.append(str);
        sbL.append(" suspendido=");
        ConcurrentHashMap.KeySetView keySetView = ProfileViewerActivity.T;
        sbL.append(keySetView.contains(Long.valueOf(j4)));
        sbL.append(" rutaViva=");
        i iVar = i.f7270a;
        sbL.append(i.e(j4));
        Log.i("KRYPT-PROXY", sbL.toString());
        iVar.c(j4);
        keySetView.remove(Long.valueOf(j4));
        Activity activity2 = (Activity) concurrentHashMap.remove(Long.valueOf(j4));
        if (activity2 != null) {
            activity2.finish();
            Log.i("KRYPT-PROXY", "closeWindow #" + j4 + " → finish() enviado (onDestroy resuelve el frasco)");
            return;
        }
        WebView webView = (WebView) ProfileViewerActivity.R.remove(Long.valueOf(j4));
        if (webView != null) {
            try {
                webView.stopLoading();
            } catch (Throwable th) {
                g.m(th);
            }
            ConcurrentHashMap concurrentHashMap2 = ProfileViewerActivity.P;
            try {
                webView.destroy();
            } catch (Throwable th2) {
                g.m(th2);
            }
            Log.i("KRYPT-PROXY", "WebView minimizado #" + j4 + " liberado desde fuera");
        }
        ProfileViewerActivity.S.remove(Long.valueOf(j4));
        boolean zJ = b.j(j4);
        if (!zJ) {
            b.e(j4);
        }
        Log.i("KRYPT-PROXY", "frasco suspendido #" + j4 + " incinerado desde ⋮ (" + zJ + ')');
    }

    public static final l d(y1.v vVar, String[] strArr, ic.l lVar) {
        y1.i iVarH = vVar.h();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        jc.i.e(strArr2, "tables");
        l0 l0Var = iVarH.f10451b;
        l0Var.getClass();
        wb.i iVar = new wb.i();
        for (String str : strArr2) {
            HashMap map = l0Var.f10485c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            jc.i.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                iVar.addAll(set);
            } else {
                iVar.add(str);
            }
        }
        String[] strArr3 = (String[]) b.b(iVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap = l0Var.f10487f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            jc.i.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i] = num.intValue();
        }
        f fVar = new f(strArr3, iArr);
        String[] strArr4 = (String[]) fVar.f9065a;
        int[] iArr2 = (int[]) fVar.f9066b;
        jc.i.e(strArr4, "resolvedTableNames");
        jc.i.e(iArr2, "tableIds");
        uc.b eVar = new e((p) new s(l0Var, iArr2, strArr4, null));
        boolean z4 = eVar instanceof h;
        j jVar = j.f10674a;
        return new l(z4 ? ((h) eVar).a(jVar, 0, 2) : new vc.f(eVar, jVar, 0, 2), vVar, lVar, 0);
    }

    public static void e(Object obj, String str, String str2) {
        String strH = h(str);
        if (Log.isLoggable(strH, 3)) {
            Log.d(strH, String.format(str2, obj));
        }
    }

    public static void f(Exception exc, String str, String str2) {
        String strH = h(str);
        if (Log.isLoggable(strH, 6)) {
            Log.e(strH, str2, exc);
        }
    }

    public static t g(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return t.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return t.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return t.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return t.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return t.SPDY_3;
        }
        if (str.equals("quic")) {
            return t.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static String h(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static boolean i(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final List j(c cVar) {
        int i = g.i(cVar, "id");
        int i10 = g.i(cVar, "seq");
        int i11 = g.i(cVar, "from");
        int i12 = g.i(cVar, "to");
        wb.c cVar2 = new wb.c(10);
        while (cVar.O()) {
            cVar2.add(new d((int) cVar.getLong(i), (int) cVar.getLong(i10), cVar.F(i11), cVar.F(i12)));
        }
        return vb.i.h0(jd.d.c(cVar2));
    }

    public static final e2.g k(g2.a aVar, String str, boolean z4) {
        c cVarR = aVar.R("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int i = g.i(cVarR, "seqno");
            int i10 = g.i(cVarR, "cid");
            int i11 = g.i(cVarR, "name");
            int i12 = g.i(cVarR, "desc");
            if (i != -1 && i10 != -1 && i11 != -1 && i12 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarR.O()) {
                    if (((int) cVarR.getLong(i10)) >= 0) {
                        int i13 = (int) cVarR.getLong(i);
                        String strF = cVarR.F(i11);
                        String str2 = cVarR.getLong(i12) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i13), strF);
                        linkedHashMap2.put(Integer.valueOf(i13), str2);
                    }
                }
                List listI0 = vb.i.i0(linkedHashMap.entrySet(), new b0.h(1));
                ArrayList arrayList = new ArrayList(k.U(listI0));
                Iterator it = listI0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listN0 = vb.i.n0(arrayList);
                List listI1 = vb.i.i0(linkedHashMap2.entrySet(), new b0.h(2));
                ArrayList arrayList2 = new ArrayList(k.U(listI1));
                Iterator it2 = listI1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                e2.g gVar = new e2.g(str, z4, listN0, vb.i.n0(arrayList2));
                b(cVarR, null);
                return gVar;
            }
            b(cVarR, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b(cVarR, th);
                throw th2;
            }
        }
    }

    public static TypedValue l(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean m(Context context, int i, boolean z4) {
        TypedValue typedValueL = l(context, i);
        if (typedValueL == null || typedValueL.type != 18) {
            return z4;
        }
        return typedValueL.data != 0;
    }

    public static TypedValue n(Context context, String str, int i) {
        TypedValue typedValueL = l(context, i);
        if (typedValueL != null) {
            return typedValueL;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void o(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.g()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(i0.n(status));
        }
    }

    public static boolean p(w wVar, n3.b bVar) {
        String string;
        boolean z4;
        boolean z10;
        String str;
        Object next;
        jc.i.e(bVar, "profile");
        String str2 = bVar.f7240c;
        int i = bVar.f7242f;
        String str3 = bVar.e;
        String str4 = bVar.f7239b;
        long j4 = bVar.f7238a;
        boolean z11 = false;
        if (bVar.b() && FirebaseAuth.getInstance().f2702f == null) {
            Toast.makeText(wVar, R.string.premium_proxy_sign_in_required, 0).show();
            return false;
        }
        boolean z12 = true;
        boolean z13 = !pc.g.m0(str3) && 1 <= i && i < 65536;
        StringBuilder sb2 = new StringBuilder("viewer.start '");
        sb2.append(str4);
        sb2.append("' id=");
        sb2.append(j4);
        sb2.append(" url=");
        sb2.append(str2);
        sb2.append(" tieneProxy=");
        sb2.append(z13);
        String str5 = " proxy=";
        if (z13) {
            StringBuilder sb3 = new StringBuilder(" proxy=");
            sb3.append(str3);
            sb3.append(':');
            sb3.append(i);
            sb3.append(" tipo=");
            sb3.append(bVar.f7241d);
            sb3.append(" auth=");
            sb3.append(bVar.f7243g.length() > 0);
            sb3.append(" yaAbierta=");
            i iVar = i.f7270a;
            sb3.append(i.e(j4));
            string = sb3.toString();
        } else {
            string = "";
        }
        sb2.append(string);
        Log.i("KRYPT-PROXY", sb2.toString());
        if (z13) {
            String strA = bVar.a();
            if (strA.length() == 0) {
                Log.w("KRYPT-PROXY", "dominio vacío para '" + str4 + "' → no se enruta");
                return false;
            }
            Iterator it = p3.a.n().iterator();
            while (true) {
                z10 = z11;
                if (!it.hasNext()) {
                    z4 = z12;
                    str = str5;
                    next = null;
                    break;
                }
                next = it.next();
                z4 = z12;
                n3.b bVar2 = (n3.b) next;
                str = str5;
                if (bVar2.f7238a != j4 && bVar2.c(bVar)) {
                    i iVar2 = i.f7270a;
                    if (i.e(bVar2.f7238a)) {
                        break;
                    }
                }
                z11 = z10;
                z12 = z4;
                str5 = str;
            }
            n3.b bVar3 = (n3.b) next;
            if (bVar3 != null) {
                String str6 = bVar3.f7239b;
                StringBuilder sbN = q1.a.n("conflicto de sitio: '", str6, "' #");
                sbN.append(bVar3.f7238a);
                sbN.append(" ya enruta '");
                sbN.append(strA);
                sbN.append("' → se pide cierre explícito");
                Log.i("KRYPT-PROXY", sbN.toString());
                ea.j jVar = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                jVar.l(R.string.profiles_open_conflict_title);
                ((g.b) jVar.f3530b).f3972f = wVar.getString(R.string.profiles_open_conflict_msg, str6);
                jVar.k(wVar.getString(R.string.profiles_open_conflict_ok, str6), new n0(bVar3, wVar, bVar, 4));
                jVar.g(R.string.cancel, null);
                jVar.m();
                return z4;
            }
            i iVar3 = i.f7270a;
            boolean zH = i.h(bVar.f7238a, bVar.f7241d, bVar.e, bVar.f7242f, bVar.f7243g, bVar.h, strA);
            Log.i("KRYPT-PROXY", "start '" + str4 + "' #" + j4 + " → routeCoincide=" + zH + " rutaViva=" + i.e(j4) + str + str3 + ':' + i + " dominio='" + strA + '\'');
            if (!zH) {
                if (i.e(j4)) {
                    Log.i("KRYPT-PROXY", "perfil '" + str4 + "' #" + j4 + " editado → remontar ruta con el nuevo proxy");
                    iVar3.c(j4);
                }
                WebView webView = (WebView) ProfileViewerActivity.R.remove(Long.valueOf(j4));
                if (webView != null) {
                    try {
                        webView.stopLoading();
                    } catch (Throwable th) {
                        g.m(th);
                    }
                    ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                    try {
                        webView.destroy();
                    } catch (Throwable th2) {
                        g.m(th2);
                    }
                    Log.i("KRYPT-PROXY", "perfil '" + str4 + "' #" + j4 + " proxy cambiado → WebView minimizado DESCARTADO");
                }
                ProfileViewerActivity.S.remove(Long.valueOf(j4));
                if (!i.f7270a.f(bVar.f7238a, bVar.f7241d, bVar.e, bVar.f7242f, bVar.f7243g, bVar.h, strA)) {
                    Log.w("KRYPT-PROXY", "openProfile falló para '" + str4 + '\'');
                    return z10;
                }
            }
        } else {
            z4 = true;
        }
        Intent intentAddFlags = new Intent(wVar, (Class<?>) ProfileViewerActivity.class).putExtra("profile_id", j4).putExtra("profile_name", str4).putExtra("profile_url", str2).addFlags(603979776);
        jc.i.d(intentAddFlags, "addFlags(...)");
        wVar.startActivity(intentAddFlags);
        return z4;
    }

    public static Object r(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            i6.h.e("Unexpected exception.", th);
            zzbuj.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public abstract Task q(String str);

    public Task s(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        a3.j jVar;
        zzaha zzahaVar;
        w9.v vVar = new w9.v(this, 2);
        synchronized (firebaseAuth) {
            jVar = firebaseAuth.f2706l;
        }
        if (jVar == null || (zzahaVar = (zzaha) jVar.f108b) == null || !zzahaVar.zzc()) {
            return q(null).continueWithTask(new a3.j(recaptchaAction, firebaseAuth, str, vVar));
        }
        return jVar.h(str, Boolean.FALSE, recaptchaAction).continueWithTask(vVar).continueWithTask(new r(str, jVar, recaptchaAction, vVar));
    }
}
