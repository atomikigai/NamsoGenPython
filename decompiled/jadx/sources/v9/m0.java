package v9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f9269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9270d;
    public final /* synthetic */ String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9271f;

    public m0(FirebaseAuth firebaseAuth, String str, boolean z4, n nVar, String str2, String str3) {
        this.f9271f = firebaseAuth;
        this.f9267a = str;
        this.f9268b = z4;
        this.f9269c = nVar;
        this.f9270d = str2;
        this.e = str3;
    }

    @Override // a.a
    public final Task q(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f9267a;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email ".concat(String.valueOf(str2)));
        }
        boolean z4 = this.f9268b;
        FirebaseAuth firebaseAuth = this.f9271f;
        if (!z4) {
            return firebaseAuth.e.zzE(firebaseAuth.f2698a, this.f9267a, this.f9270d, this.e, str, new f0(firebaseAuth));
        }
        zzadv zzadvVar = firebaseAuth.e;
        n9.g gVar = firebaseAuth.f2698a;
        n nVar = this.f9269c;
        com.google.android.gms.common.internal.i0.i(nVar);
        return zzadvVar.zzt(gVar, nVar, this.f9267a, this.f9270d, this.e, str, new g0(firebaseAuth, 0));
    }
}
