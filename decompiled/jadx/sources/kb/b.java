package kb;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e6.q;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f6146c;

    public b(q qVar, int i, long j4) {
        this.f6146c = qVar;
        this.f6144a = i;
        this.f6145b = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final q qVar = this.f6146c;
        int i = this.f6144a;
        final long j4 = this.f6145b;
        synchronized (qVar) {
            final int i10 = i - 1;
            final Task taskC = ((h) qVar.f3392c).c(3 - i10);
            final Task taskB = ((c) qVar.f3393d).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask((ScheduledExecutorService) qVar.f3394f, new Continuation() { // from class: kb.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Boolean boolValueOf;
                    q qVar2 = qVar;
                    Task task2 = taskC;
                    Task task3 = taskB;
                    long j10 = j4;
                    int i11 = i10;
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new jb.c("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new jb.c("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    g gVar = (g) task2.getResult();
                    e eVar = (e) task3.getResult();
                    e eVar2 = gVar.f6166b;
                    if (eVar2 != null) {
                        boolValueOf = Boolean.valueOf(eVar2.f6160f >= j10);
                    } else {
                        boolValueOf = Boolean.valueOf(gVar.f6165a == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        qVar2.a(i11, j10);
                        return Tasks.forResult(null);
                    }
                    if (gVar.f6166b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (eVar == null) {
                        d dVarB = e.b();
                        eVar = new e((JSONObject) dVarB.f6152b, (Date) dVarB.f6154d, (JSONArray) dVarB.e, (JSONObject) dVarB.f6153c, dVarB.f6151a);
                    }
                    e eVar3 = gVar.f6166b;
                    JSONObject jSONObject = eVar.e;
                    JSONObject jSONObject2 = eVar3.f6156a;
                    JSONObject jSONObject3 = eVar3.f6157b;
                    JSONObject jSONObject4 = eVar3.e;
                    JSONObject jSONObject5 = e.a(new JSONObject(jSONObject2.toString())).f6157b;
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = eVar.f6157b;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    synchronized (qVar2) {
                        Iterator it = ((LinkedHashSet) qVar2.f3390a).iterator();
                        while (it.hasNext()) {
                            ((l) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}
