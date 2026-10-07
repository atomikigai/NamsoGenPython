package e7;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.p000authapi.zbbb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f3482a;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        super(context, looper, 91, iVar, mVar, nVar);
        Set<Scope> set = iVar.f2195b;
        d7.b bVar = googleSignInOptions != null ? new d7.b(googleSignInOptions) : new d7.b();
        bVar.i = zbbb.zba();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f3001a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f2022z;
        HashSet hashSet2 = bVar.f3001a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f2021y;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (bVar.f3004d && (bVar.f3005f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f2020x);
        }
        this.f3482a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f3005f, bVar.f3004d, bVar.f3002b, bVar.f3003c, bVar.e, bVar.f3006g, bVar.h, bVar.i);
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final Intent getSignInIntent() {
        return h.a(getContext(), this.f3482a);
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean providesSignIn() {
        return true;
    }
}
