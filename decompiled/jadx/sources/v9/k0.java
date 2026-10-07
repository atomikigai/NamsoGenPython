package v9;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9262d;

    public /* synthetic */ k0(FirebaseAuth firebaseAuth, String str, Object obj, int i) {
        this.f9259a = i;
        this.f9262d = firebaseAuth;
        this.f9260b = str;
        this.f9261c = obj;
    }

    @Override // a.a
    public final Task q(String str) {
        switch (this.f9259a) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = this.f9260b;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email ".concat(String.valueOf(str2)));
                }
                b bVar = (b) this.f9261c;
                FirebaseAuth firebaseAuth = this.f9262d;
                return firebaseAuth.e.zzy(firebaseAuth.f2698a, this.f9260b, bVar, firebaseAuth.f2705k, str);
            case 1:
                boolean zIsEmpty2 = TextUtils.isEmpty(str);
                String str3 = this.f9260b;
                if (zIsEmpty2) {
                    Log.i("FirebaseAuth", "Email link sign in for " + str3 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for ".concat(String.valueOf(str3)));
                }
                b bVar2 = (b) this.f9261c;
                FirebaseAuth firebaseAuth2 = this.f9262d;
                return firebaseAuth2.e.zzz(firebaseAuth2.f2698a, this.f9260b, bVar2, firebaseAuth2.f2705k, str);
            default:
                boolean zIsEmpty3 = TextUtils.isEmpty(str);
                String str4 = this.f9260b;
                if (zIsEmpty3) {
                    Log.i("FirebaseAuth", "Creating user with " + str4 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email ".concat(String.valueOf(str4)));
                }
                String str5 = (String) this.f9261c;
                FirebaseAuth firebaseAuth3 = this.f9262d;
                return firebaseAuth3.e.zzd(firebaseAuth3.f2698a, this.f9260b, str5, firebaseAuth3.f2705k, str, new f0(firebaseAuth3));
        }
    }
}
