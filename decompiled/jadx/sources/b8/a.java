package b8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements com.google.android.gms.common.api.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f1423d;

    public a(Context context, Looper looper, i iVar, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, iVar, mVar, nVar);
        this.f1420a = true;
        this.f1421b = iVar;
        this.f1422c = bundle;
        this.f1423d = iVar.f2199g;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        i iVar = this.f1421b;
        boolean zEquals = getContext().getPackageName().equals(iVar.f2197d);
        Bundle bundle = this.f1422c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", iVar.f2197d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f1420a;
    }
}
