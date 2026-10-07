package fd;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import bd.w;
import h6.o0;
import id.b0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3914d;
    public Object e;

    public e(s4.i iVar) {
        this.f3912b = iVar;
    }

    public IOException a(boolean z4, boolean z10, IOException iOException) {
        i iVar = (i) this.f3912b;
        if (iOException != null) {
            e(iOException);
        }
        return iVar.f(this, z10, z4, iOException);
    }

    public o0 b() {
        Intent intent = (Intent) this.f3912b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3911a);
        ((wa.d) this.f3913c).getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = (Bundle) this.e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String strA = o.j.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f3914d) == null) {
                this.f3914d = o.i.a();
            }
            o.k.a((ActivityOptions) this.f3914d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f3914d;
        return new o0(15, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public r4.i c() {
        s4.i iVar = (s4.i) this.f3912b;
        v9.d dVar = (v9.d) this.f3913c;
        if (dVar != null && iVar == null) {
            return new r4.i(null, null, null, false, new r4.g(5), dVar);
        }
        String str = iVar.f8421a;
        if (r4.e.e.contains(str) && TextUtils.isEmpty((String) this.f3914d)) {
            throw new IllegalStateException("Token cannot be null when using a non-email provider.");
        }
        if (str.equals("twitter.com") && TextUtils.isEmpty((String) this.e)) {
            throw new IllegalStateException("Secret cannot be null when using the Twitter provider.");
        }
        return new r4.i((s4.i) this.f3912b, (String) this.f3914d, (String) this.e, this.f3911a, null, (v9.d) this.f3913c);
    }

    public w d(boolean z4) throws IOException {
        try {
            w wVarD = ((gd.d) this.f3914d).d(z4);
            if (wVarD == null) {
                return wVarD;
            }
            wVarD.f1695m = this;
            return wVarD;
        } catch (IOException e) {
            e(e);
            throw e;
        }
    }

    public void e(IOException iOException) {
        this.f3911a = true;
        ((f) this.f3913c).c(iOException);
        k kVarE = ((gd.d) this.f3914d).e();
        i iVar = (i) this.f3912b;
        synchronized (kVarE) {
            try {
                if (!(iOException instanceof b0)) {
                    if (!(kVarE.f3942g != null) || (iOException instanceof id.a)) {
                        kVarE.f3943j = true;
                        if (kVarE.f3946m == 0) {
                            k.d(iVar.f3923a, kVarE.f3938b, iOException);
                            kVarE.f3945l++;
                        }
                    }
                } else if (((b0) iOException).f5265a == 8) {
                    int i = kVarE.f3947n + 1;
                    kVarE.f3947n = i;
                    if (i > 1) {
                        kVarE.f3943j = true;
                        kVarE.f3945l++;
                    }
                } else if (((b0) iOException).f5265a != 9 || !iVar.f3934x) {
                    kVarE.f3943j = true;
                    kVarE.f3945l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e() {
        this.f3912b = new Intent("android.intent.action.VIEW");
        this.f3913c = new wa.d();
        this.f3911a = true;
    }

    public e(o.n nVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f3912b = intent;
        this.f3913c = new wa.d();
        this.f3911a = true;
        if (nVar != null) {
            intent.setPackage(nVar.f7433d.getPackageName());
            o.g gVar = nVar.f7432c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", gVar);
            intent.putExtras(bundle);
        }
    }
}
