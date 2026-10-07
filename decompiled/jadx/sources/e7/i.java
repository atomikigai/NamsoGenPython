package e7;

import a4.e0;
import a4.h0;
import a4.t;
import a4.y;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.f0;
import androidx.fragment.app.i0;
import androidx.fragment.app.s;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import g.u;
import h3.e1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import k.x;
import l.x0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class i implements y, u3.c, m0.e, androidx.activity.result.b, h2.g, com.google.android.gms.common.internal.e, d4.k, zzfqs, Continuation, x, o3.c, zzapt, k9.g, x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f3487c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3489b;

    public /* synthetic */ i(Object obj, int i) {
        this.f3488a = i;
        this.f3489b = obj;
    }

    public static boolean A(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String E(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i F(Context context) {
        i iVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (i.class) {
            iVar = f3487c;
            if (iVar == null) {
                iVar = new i(applicationContext);
                f3487c = iVar;
            }
        }
        return iVar;
        return iVar;
    }

    public Bundle C() {
        Bundle bundle = (Bundle) this.f3489b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public ka.b D(JSONObject jSONObject) {
        ka.c cVar;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            cVar = new wa.d();
        } else {
            cVar = new z9.c();
        }
        return cVar.f((b9.e) this.f3489b, jSONObject);
    }

    public synchronized void G() {
        b bVar = (b) this.f3489b;
        ReentrantLock reentrantLock = bVar.f3470a;
        reentrantLock.lock();
        try {
            bVar.f3471b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // k9.h
    public Object a() {
        return this.f3489b;
    }

    @Override // k.x
    public void b(k.l lVar, boolean z4) {
        ((u) this.f3489b).v(lVar);
    }

    @Override // h2.g
    public void c(h2.f fVar) {
        b2.e eVar = (b2.e) this.f3489b;
        int length = eVar.f1356d.length;
        for (int i = 1; i < length; i++) {
            int i10 = eVar.f1356d[i];
            if (i10 == 1) {
                fVar.b(i, eVar.e[i]);
            } else if (i10 == 2) {
                fVar.l(i, eVar.f1357f[i]);
            } else if (i10 == 3) {
                String str = eVar.f1358r[i];
                jc.i.b(str);
                fVar.j(i, str);
            } else if (i10 == 4) {
                byte[] bArr = eVar.f1359s[i];
                jc.i.b(bArr);
                fVar.w(i, bArr);
            } else if (i10 == 5) {
                fVar.I(i);
            }
        }
    }

    @Override // d4.k
    public int d() {
        return (g() << 8) | g();
    }

    @Override // androidx.activity.result.b
    public void e(Object obj) {
        switch (this.f3488a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.f3489b;
                f0 f0Var = (f0) i0Var.f896w.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.f866a;
                    int i = f0Var.f867b;
                    s sVarO = i0Var.f879c.o(str);
                    if (sVarO != null) {
                        sVarO.A(i, aVar.f386a, aVar.f387b);
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f3489b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f387b;
                int i10 = aVar2.f386a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i10 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", zzie.ERROR_IN_ACTIVITY_RESULT.zza());
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
                }
                int i11 = zzc.zzh(intent, "ProxyBillingActivityV2").f7495a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.J;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, extras);
                } else {
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i11 != 0) {
                    zzc.zzn("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // d4.k
    public short g() throws d4.j {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3489b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new d4.j();
    }

    @Override // k.x
    public boolean h(k.l lVar) {
        Window.Callback callback = ((u) this.f3489b).f4106w.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override // a4.y
    public a4.x i(e0 e0Var) {
        switch (this.f3488a) {
            case 1:
                return new a4.d((h0) this.f3489b, 1);
            case 2:
                return new t((Context) this.f3489b, 0);
            default:
                return new a4.c((Resources) this.f3489b, e0Var.a(Uri.class, InputStream.class));
        }
    }

    @Override // d4.k
    public int j(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3489b;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    public void l(String str, String str2) {
        StringBuilder sb2 = (StringBuilder) this.f3489b;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        sb2.append((sb2.charAt(sb2.length() + (-1)) == '?' ? "" : "&") + str + "=" + str2);
    }

    public boolean m(String str) {
        String strY = y(str);
        return "1".equals(strY) || Boolean.parseBoolean(strY);
    }

    public Integer n(String str) {
        String strY = y(str);
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strY));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + E(str) + "(" + strY + ") into an int");
            return null;
        }
    }

    @Override // h2.g
    public String o() {
        return ((b2.e) this.f3489b).f1363b;
    }

    @Override // m0.e
    public void onCancel() {
        ((Animator) this.f3489b).end();
    }

    @Override // u3.c
    public boolean p(Object obj, File file, u3.i iVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        x3.f fVar = (x3.f) this.f3489b;
        byte[] bArr = (byte[]) fVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        fVar.g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        fVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                fVar.g(bArr);
                return true;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o3.c
    public void q(o3.e eVar) {
        switch (this.f3488a) {
            case 20:
                jc.i.e(eVar, "billingResult");
                if (eVar.f7495a != 0) {
                    Log.e("Billing", "BillingClient setup failed: " + eVar.f7497c);
                } else {
                    Log.d("Billing", "BillingClient setup finished.");
                    ((e1) this.f3489b).e0();
                }
                break;
            case 26:
                l3.y yVar = (l3.y) this.f3489b;
                jc.i.e(eVar, "billingResult");
                if (eVar.f7495a != 0) {
                    Log.e("PremiumDialog", "Billing setup failed: " + eVar.f7497c);
                } else {
                    yVar.m0();
                    yVar.l0();
                }
                break;
            default:
                jc.i.e(eVar, "billingResult");
                if (eVar.f7495a != 0) {
                    Log.e("SubscriptionDialog", "Billing connection error: " + eVar.f7497c);
                } else {
                    ((m3.b) this.f3489b).h0();
                }
                break;
        }
    }

    @Override // o3.c
    public void r() {
        switch (this.f3488a) {
            case 20:
                Log.e("Billing", "Billing service disconnected.");
                break;
            case 26:
                Log.w("PremiumDialog", "Billing disconnected.");
                break;
        }
    }

    public JSONArray s(String str) {
        String strY = y(str);
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        try {
            return new JSONArray(strY);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + E(str) + ": " + strY + ", falling back to default");
            return null;
        }
    }

    @Override // d4.k
    public long skip(long j4) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f3489b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j4);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public int[] t() {
        JSONArray jSONArrayS = s("gcm.n.light_settings");
        if (jSONArrayS == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayS.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayS.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayS.optInt(1);
            iArr[2] = jSONArrayS.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayS + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayS + ". Skipping setting LightSettings");
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.f3489b).call();
    }

    public Object[] u(String str) {
        JSONArray jSONArrayS = s(str.concat("_loc_args"));
        if (jSONArrayS == null) {
            return null;
        }
        int length = jSONArrayS.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayS.optString(i);
        }
        return strArr;
    }

    public String v(String str) {
        return y(str.concat("_loc_key"));
    }

    public Long w() {
        String strY = y("gcm.n.event_time");
        if (TextUtils.isEmpty(strY)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strY));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + E("gcm.n.event_time") + "(" + strY + ") into a long");
            return null;
        }
    }

    public String x(Resources resources, String str, String str2) {
        String strY = y(str2);
        if (!TextUtils.isEmpty(strY)) {
            return strY;
        }
        String strV = v(str2);
        if (TextUtils.isEmpty(strV)) {
            return null;
        }
        int identifier = resources.getIdentifier(strV, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", E(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrU = u(str2);
        if (objArrU == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrU);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + E(str2) + ": " + Arrays.toString(objArrU) + " Default value will be used.", e);
            return null;
        }
    }

    public String y(String str) {
        Bundle bundle = (Bundle) this.f3489b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] z() {
        JSONArray jSONArrayS = s("gcm.n.vibrate_timings");
        if (jSONArrayS == null) {
            return null;
        }
        try {
            if (jSONArrayS.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayS.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayS.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayS + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public void zza(int i, long j4) {
        ((d6.h) this.f3489b).f2946s.zzd(i, System.currentTimeMillis() - j4);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public void zzb(int i, long j4, String str) {
        ((d6.h) this.f3489b).f2946s.zze(i, System.currentTimeMillis() - j4, str);
    }

    public i(Context context) {
        String strD;
        this.f3488a = 0;
        b bVarA = b.a(context);
        this.f3489b = bVarA;
        bVarA.b();
        String strD2 = bVarA.d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.g(strD);
        } catch (JSONException unused) {
        }
    }

    @Override // l.x0
    public void a(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public void zza(zzapy zzapyVar) {
        ((zzcao) this.f3489b).zzd(zzapyVar);
    }

    public i(Bundle bundle) {
        this.f3488a = 19;
        if (bundle != null) {
            this.f3489b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public i(TextView textView) {
        this.f3488a = 18;
        this.f3489b = new g1.g(textView);
    }

    public i(int i) {
        this.f3488a = i;
        switch (i) {
            case 5:
                break;
            case 22:
                this.f3489b = null;
                break;
            default:
                this.f3489b = new h0(7);
                break;
        }
    }

    private final void B() {
    }

    public i(cd.a aVar) {
        this.f3488a = 16;
        this.f3489b = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    @Override // l.x0
    public void k(int i) {
    }

    public i(ByteBuffer byteBuffer) {
        this.f3488a = 12;
        this.f3489b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
