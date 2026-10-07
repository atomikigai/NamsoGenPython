package f7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int h;
    public static PendingIntent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f3614j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.k f3615a = new r.k(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f3617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3618d;
    public final Messenger e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f3619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f3620g;

    public a(Context context) {
        this.f3616b = context;
        l lVar = new l();
        lVar.f3643b = 0;
        lVar.f3644c = context;
        this.f3617c = lVar;
        this.e = new Messenger(new b(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3618d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    public final Task a(Bundle bundle) {
        String string;
        synchronized (a.class) {
            int i10 = h;
            h = i10 + 1;
            string = Integer.toString(i10);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f3615a) {
            this.f3615a.put(string, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f3617c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f3616b;
        synchronized (a.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = zza.zza(context, 0, intent2, zza.zza);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 5);
        sb2.append("|ID|");
        sb2.append(string);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(strValueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f3619f != null || this.f3620g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f3619f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f3620g.f3622a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f3617c.b() == 2) {
                    this.f3616b.sendBroadcast(intent);
                } else {
                    this.f3616b.startService(intent);
                }
            }
        } else if (this.f3617c.b() == 2) {
            this.f3616b.sendBroadcast(intent);
        } else {
            this.f3616b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(n.f3647a, new a2.l(this, string, this.f3618d.schedule(new androidx.activity.i(taskCompletionSource, 17), 30L, TimeUnit.SECONDS), 13));
        return taskCompletionSource.getTask();
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f3615a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3615a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                } else {
                    String strValueOf = String.valueOf(str);
                    Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
