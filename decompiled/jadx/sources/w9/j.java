package w9;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagx;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrityManager f9844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f9845c;

    public j(v vVar, String str, IntegrityManager integrityManager) {
        this.f9845c = vVar;
        this.f9843a = str;
        this.f9844b = integrityManager;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("v", "Problem retrieving Play Integrity producer project:  ".concat(String.valueOf(task.getException().getMessage())));
            return Tasks.forException(task.getException());
        }
        this.f9845c.f9864b = ((zzagx) task.getResult()).zzb();
        return this.f9844b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(((zzagx) task.getResult()).zzb())).setNonce(new String(Base64.encode(MessageDigest.getInstance("SHA-256").digest(this.f9843a.getBytes("UTF-8")), 11))).build());
    }
}
