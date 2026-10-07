package h6;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbwh;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzdpq;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfew;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfxd;
import com.google.android.gms.internal.ads.zzhgq;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l0 f5068l = new l0(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5074g;
    public volatile String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5069a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5070b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f5071c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5072d = new AtomicBoolean();
    public boolean e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5073f = new Object();
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5075j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f5076k = Executors.newSingleThreadExecutor();

    public static int B(Context context, Uri uri) {
        if (context == null) {
            k0.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        zzbce zzbceVar = zzbcn.zzeF;
        e6.t tVar = e6.t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            o0 o0VarB = new fd.e(d6.p.C.f2986m.zza()).b();
            ((Intent) o0VarB.f5061b).setPackage(zzhgq.zza(context));
            o0VarB.l(context, uri);
            return 5;
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzeD)).booleanValue()) {
            zzbdo zzbdoVar = new zzbdo();
            zzbdoVar.zze(new a2.l(zzbdoVar, context, uri, 18));
            zzbdoVar.zzb((Activity) context);
            return 5;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        intent2.addFlags(268435456);
        context.startActivity(intent2);
        return 9;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean C(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void D(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String E(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return s(r(context));
    }

    public static final String F() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("; ");
        sb2.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb2.append("; ");
            sb2.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb2.append(" Build/");
                sb2.append(str3);
            }
        }
        sb2.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb2.toString();
    }

    public static final String G() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : da.v.u(str, " ", str2);
    }

    public static final HashMap H(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            d6.p.C.f2982g.zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long I(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final z J(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                i6.h.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new y(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e) {
            d6.p.C.f2982g.zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean a(Context context, String str) {
        Context contextZza = zzbwh.zza(context);
        return ((Context) p7.c.a(contextZza).f7823a).getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean b(Context context) {
        try {
            if (n7.c.h == null) {
                n7.c.h = Boolean.valueOf(n7.c.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return n7.c.h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean c(String str) {
        if (!i6.g.c()) {
            return false;
        }
        zzbce zzbceVar = zzbcn.zzeX;
        e6.t tVar = e6.t.f3437d;
        if (!((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) tVar.f3440c.zza(zzbcn.zzeZ);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) e6.t.f3437d.f3440c.zza(zzbcn.zzeY);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            i6.h.e("Error loading class.", th);
            d6.p.C.f2982g.zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            Bundle bundleR = r(context);
            return TextUtils.isEmpty(s(bundleR)) && !TextUtils.isEmpty(bundleR.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
    }

    public static final boolean g(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void h(View view, int i) {
        String strZza;
        int i10;
        int iHeight;
        int iWidth;
        String str;
        zzfet zzfetVarZzD;
        zzfew zzfewVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof zzdpq) {
                childAt = ((zzdpq) childAt).getChildAt(0);
            }
            if (childAt instanceof n6.i) {
                strZza = "NATIVE";
                i10 = 1;
            } else {
                strZza = "UNKNOWN";
                i10 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            r0 r0Var = d6.p.C.f2979c;
            long jI = I(childAt);
            childAt.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcgn) || (zzfewVarZzR = ((zzcgn) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfewVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzcfb) && (zzfetVarZzD = ((zzcfb) childAt).zzD()) != null) {
                strZza = zzfet.zza(zzfetVarZzD.zzb);
                i10 = zzfetVarZzD.zze;
                str2 = zzfetVarZzD.zzE;
            }
            Locale locale = Locale.US;
            i6.h.f("<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i10 + ", class=" + childAt.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + jI + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e) {
            i6.h.e("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder i(Context context) {
        s0 s0Var = d6.p.C.e;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void j(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            new a0(context, str, (String) obj).zzb();
        }
    }

    public static final int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            i6.h.g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final HashMap l(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] m(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] n(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        e6.s sVar = e6.s.f3427f;
        return new int[]{sVar.f3428a.f(activity, iArr[0]), sVar.f3428a.f(activity, iArr[1])};
    }

    public static final boolean o(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z4 = d6.p.C.f2979c.e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || C(view);
        long jI = I(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z4)) {
            zzbce zzbceVar = zzbcn.zzbs;
            e6.t tVar = e6.t.f3437d;
            zzbcl zzbclVar = tVar.f3440c;
            zzbcl zzbclVar2 = tVar.f3440c;
            if ((!((Boolean) zzbclVar.zza(zzbceVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) && (!((Boolean) zzbclVar2.zza(zzbcn.zzkk)).booleanValue() || jI >= ((Integer) zzbclVar2.zza(zzbcn.zzkm)).intValue())) {
                return true;
            }
        }
        return false;
    }

    public static final void p(Context context, Intent intent) {
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkH)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            i6.h.h("", e);
            d6.p.C.f2982g.zzw(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void q(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            D(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            i6.h.b("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            i6.h.e("No browser is found.", e);
        }
    }

    public static Bundle r(Context context) {
        try {
            return p7.c.a(context).d(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            k0.l("Error getting metadata", e);
            return null;
        }
    }

    public static String s(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static int t(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        i6.h.g("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static boolean u(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String v(Context context, String str) {
        Context contextCreatePackageContext;
        if (str == null) {
            return F();
        }
        String strF = null;
        try {
            if (da.a0.f3088b == null) {
                da.a0.f3088b = new da.a0();
            }
            da.a0 a0Var = da.a0.f3088b;
            if (TextUtils.isEmpty(a0Var.f3089a)) {
                AtomicBoolean atomicBoolean = g7.h.f4242a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                a0Var.f3089a = (String) a.a.r(context, new d6.g(contextCreatePackageContext, context, 4, false));
            }
            strF = a0Var.f3089a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strF)) {
            strF = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strF)) {
            strF = F();
        }
        String strU = da.v.u(strF, " (Mobile; ", str);
        try {
            if (p7.c.a(context).h()) {
                strU = strU + ";aia";
            }
        } catch (Exception e) {
            d6.p.C.f2982g.zzw(e, "AdUtil.getUserAgent");
        }
        return strU.concat(")");
    }

    public static ArrayList x() {
        zzbce zzbceVar = zzbcn.zza;
        List listZzb = e6.t.f3437d.f3438a.zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzfxd.zzb(zzfwf.zzc(',')).zzc((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    k0.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final void A(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbcn.zza(context);
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkG)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new a3.c(this, 4), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new a3.c(this, 4), intentFilter, 4);
        }
        this.i = true;
    }

    public final String w(Context context, String str) {
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkT)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            this.h = v(context, str);
            return this.h;
        }
        synchronized (this.f5073f) {
            try {
                String str2 = this.f5074g;
                if (str2 != null) {
                    return str2;
                }
                String strV = v(context, str);
                this.f5074g = strV;
                return strV;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int iT = t(i);
        i6.h.f("HTTP timeout: " + iT + " milliseconds.");
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", w(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void z(Context context) {
        if (this.f5075j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbcn.zza(context);
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzkG)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new q0(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new q0(), intentFilter, 4);
        }
        this.f5075j = true;
    }
}
