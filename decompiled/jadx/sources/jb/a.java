package jb;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kb.n;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5734a;

    public /* synthetic */ a(b bVar) {
        this.f5734a = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        b bVar = this.f5734a;
        Task taskB = bVar.f5737c.b();
        Task taskB2 = bVar.f5738d.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskB, taskB2}).continueWithTask(bVar.f5736b, new e5.d(bVar, taskB, taskB2, 6));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z4;
        b bVar = this.f5734a;
        if (task.isSuccessful()) {
            kb.c cVar = bVar.f5737c;
            synchronized (cVar) {
                cVar.f6150c = Tasks.forResult(null);
            }
            n nVar = cVar.f6149b;
            synchronized (nVar) {
                nVar.f6203a.deleteFile(nVar.f6204b);
            }
            if (task.getResult() != null) {
                JSONArray jSONArray = ((kb.e) task.getResult()).f6159d;
                o9.c cVar2 = bVar.f5735a;
                if (cVar2 != null) {
                    try {
                        cVar2.c(b.e(jSONArray));
                    } catch (o9.a e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e4) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e4);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
