package androidx.emoji2.text;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f764c;

    public /* synthetic */ f(Object obj) {
        this.f763b = obj;
    }

    public o3.b a() {
        Context context = (Context) this.f763b;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((o3.n) this.f764c) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((wa.d) this.f762a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((wa.d) this.f762a).getClass();
        if (((o3.n) this.f764c) == null) {
            wa.d dVar = (wa.d) this.f762a;
            return b() ? new o3.u(dVar, context, this) : new o3.b(dVar, context, this);
        }
        wa.d dVar2 = (wa.d) this.f762a;
        o3.n nVar = (o3.n) this.f764c;
        return b() ? new o3.u(dVar2, context, nVar, this) : new o3.b(dVar2, context, nVar, this);
    }

    public boolean b() {
        try {
            Context context = (Context) this.f763b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }

    public f(x9.o oVar) {
        ca.b bVar = new ca.b();
        z9.c cVar = new z9.c();
        this.f764c = bVar;
        this.f763b = new ArrayList();
        this.f762a = cVar;
        oVar.a(new z9.a(this));
    }
}
