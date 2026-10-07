package a8;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.p000authapi.zbo;
import com.google.android.gms.internal.p001authapiphone.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import r.e;
import x6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.api.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a;

    public /* synthetic */ b(int i) {
        this.f244a = i;
    }

    @Override // com.google.android.gms.common.api.a
    public g buildClient(Context context, Looper looper, i iVar, Object obj, m mVar, n nVar) {
        switch (this.f244a) {
            case 0:
                iVar.getClass();
                Integer num = iVar.f2199g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new b8.a(context, looper, iVar, bundle, mVar, nVar);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            case 2:
            case 3:
            default:
                return super.buildClient(context, looper, iVar, obj, mVar, nVar);
            case 4:
                return new zzam(context, looper, iVar, mVar, nVar);
            case 5:
                HashSet hashSet = new HashSet();
                new HashSet();
                e eVar = new e(0);
                e eVar2 = new e(0);
                int i = g7.e.f4238c;
                b bVar = c.f245a;
                new ArrayList();
                new ArrayList();
                context.getMainLooper();
                String packageName = context.getPackageName();
                String name = context.getClass().getName();
                com.google.android.gms.common.api.i iVar2 = c.f246b;
                return new zzaz(context, looper, mVar, nVar, "activity_recognition", new i(hashSet, eVar, packageName, name, eVar2.containsKey(iVar2) ? (a) eVar2.get(iVar2) : a.f243a));
            case 6:
                return new zzaz(context, looper, mVar, nVar, "locationServices", iVar);
            case 7:
                return new zbo(context, looper, iVar, (x6.a) obj, mVar, nVar);
            case 8:
                return new e7.e(context, looper, iVar, (GoogleSignInOptions) obj, mVar, nVar);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f244a) {
            case 8:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.EMPTY_LIST : new ArrayList(googleSignInOptions.f2024b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ g buildClient(Context context, Looper looper, i iVar, Object obj, com.google.android.gms.common.api.internal.g gVar, q qVar) {
        switch (this.f244a) {
            case 2:
                return new zzw(context, looper, iVar, gVar, qVar);
            case 3:
                return new i7.c(context, looper, iVar, (w) obj, gVar, qVar);
            case 9:
                return new zzbe(context, looper, iVar, (d) obj, gVar, qVar);
            default:
                return super.buildClient(context, looper, iVar, obj, gVar, qVar);
        }
    }
}
