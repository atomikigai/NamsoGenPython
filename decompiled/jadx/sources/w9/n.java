package w9;

import android.content.SharedPreferences;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzam f9850d = zzam.zzj("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    public static final n e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Task f9851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Task f9852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9853c;

    static {
        n nVar = new n();
        nVar.f9853c = 0L;
        e = nVar;
    }

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        zzam zzamVar = f9850d;
        int size = zzamVar.size();
        for (int i = 0; i < size; i++) {
            editorEdit.remove((String) zzamVar.get(i));
        }
        editorEdit.commit();
    }
}
