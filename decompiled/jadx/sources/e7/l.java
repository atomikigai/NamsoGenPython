package e7;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends zbb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevocationBoundService f3490a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f3490a = revocationBoundService;
    }

    public final void y() {
        if (!n7.c.j(this.f3490a, Binder.getCallingUid())) {
            throw new SecurityException(q1.a.j(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i10) throws JSONException {
        BasePendingResult basePendingResultDoWrite;
        String strD;
        RevocationBoundService revocationBoundService = this.f3490a;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            y();
            i.F(revocationBoundService).G();
            return true;
        }
        y();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsG = GoogleSignInOptions.f2018v;
        if (googleSignInAccountB != null) {
            String strD2 = bVarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsG = null;
            } else {
                try {
                    googleSignInOptionsG = GoogleSignInOptions.g(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsG = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsG;
        i0.i(googleSignInOptions);
        d7.a aVar = new d7.a(revocationBoundService, null, x6.b.f10299b, googleSignInOptions, new com.google.android.gms.common.api.k(new b9.e(8), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            o oVarAsGoogleApiClient = aVar.asGoogleApiClient();
            Context applicationContext = aVar.getApplicationContext();
            boolean z4 = aVar.c() == 3;
            h.f3486a.a("Revoking access", new Object[0]);
            String strD3 = b.a(applicationContext).d("refreshToken");
            h.b(applicationContext);
            if (!z4) {
                basePendingResultDoWrite = ((com.google.android.gms.common.api.internal.i0) oVarAsGoogleApiClient).f2119b.doWrite(new g(oVarAsGoogleApiClient, 1));
            } else if (strD3 == null) {
                j7.a aVar2 = c.f3472c;
                Status status = new Status(4, null, null, null);
                i0.a("Status code must not be SUCCESS", !status.g());
                basePendingResultDoWrite = new x(status);
                basePendingResultDoWrite.setResult(status);
            } else {
                c cVar = new c(strD3);
                new Thread(cVar).start();
                basePendingResultDoWrite = cVar.f3474b;
            }
            wa.d dVar = new wa.d();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResultDoWrite.addStatusListener(new z(basePendingResultDoWrite, taskCompletionSource, dVar));
            taskCompletionSource.getTask();
        } else {
            aVar.signOut();
        }
        return true;
    }
}
