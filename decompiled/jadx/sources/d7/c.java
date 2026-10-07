package d7;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f3007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f3008b;

    public c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f3008b = googleSignInAccount;
        this.f3007a = status;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f3007a;
    }
}
