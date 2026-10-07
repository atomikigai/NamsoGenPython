package gb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f4516j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd.v f4519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f4520d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f4521f;
    public final v h;
    public final r.e e = new r.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4522g = false;

    public x(FirebaseMessaging firebaseMessaging, n nVar, v vVar, bd.v vVar2, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f4520d = firebaseMessaging;
        this.f4518b = nVar;
        this.h = vVar;
        this.f4519c = vVar2;
        this.f4517a = context;
        this.f4521f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e4);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f4520d.a();
        bd.v vVar = this.f4519c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.h(vVar.q(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f4520d.a();
        bd.v vVar = this.f4519c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.h(vVar.q(strA, "/topics/" + str, bundle)));
    }

    public final Task d(u uVar) {
        ArrayDeque arrayDeque;
        v vVar = this.h;
        synchronized (vVar) {
            bd.u uVar2 = vVar.f4510a;
            String str = uVar.f4508c;
            uVar2.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) uVar2.f1678d)) {
                synchronized (((ArrayDeque) uVar2.e)) {
                    if (((ArrayDeque) uVar2.e).add(str)) {
                        ((ScheduledThreadPoolExecutor) uVar2.f1679f).execute(new androidx.activity.d(uVar2, 13));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.e) {
            try {
                String str2 = uVar.f4508c;
                if (this.e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.e.get(str2);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized void e(boolean z4) {
        this.f4522g = z4;
    }

    public final void f() {
        boolean z4;
        if (this.h.a() != null) {
            synchronized (this) {
                z4 = this.f4522g;
            }
            if (z4) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0106 */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: IOException -> 0x0062, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[Catch: IOException -> 0x0062, TRY_LEAVE, TryCatch #2 {IOException -> 0x0062, blocks: (B:15:0x002b, B:32:0x008b, B:34:0x0093, B:20:0x003c, B:22:0x0044, B:24:0x004f, B:27:0x0065, B:29:0x006d, B:31:0x0078), top: B:86:0x002b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0093, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.x.g():boolean");
    }

    public final void h(long j4) {
        this.f4521f.schedule(new z(this, this.f4517a, this.f4518b, Math.min(Math.max(30L, 2 * j4), i)), j4, TimeUnit.SECONDS);
        e(true);
    }
}
