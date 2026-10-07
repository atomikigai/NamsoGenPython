package gb;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.b f4446a;

    public b0(a4.b bVar) {
        this.f4446a = bVar;
    }

    public final void a(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = c0Var.f4448a;
        g gVar = (g) this.f4446a.f113b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gVar.f4460a.execute(new androidx.emoji2.text.m(gVar, intent, taskCompletionSource, 3));
        taskCompletionSource.getTask().addOnCompleteListener(new androidx.webkit.a(3), new a5.a(c0Var, 10));
    }
}
