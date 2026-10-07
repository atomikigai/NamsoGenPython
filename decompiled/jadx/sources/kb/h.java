package kb;

import android.text.format.DateUtils;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final long i = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f6168j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za.d f6169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya.b f6170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f6172d;
    public final c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f6173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f6174g;
    public final Map h;

    public h(za.d dVar, ya.b bVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, k kVar, HashMap map) {
        this.f6169a = dVar;
        this.f6170b = bVar;
        this.f6171c = executor;
        this.f6172d = random;
        this.e = cVar;
        this.f6173f = configFetchHttpClient;
        this.f6174g = kVar;
        this.h = map;
    }

    public final g a(String str, String str2, Date date, HashMap map) throws jb.d {
        Date date2;
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f6173f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f6173f;
            HashMap mapD = d();
            String string = this.f6174g.f6183a.getString("last_fetch_etag", null);
            r9.b bVar = (r9.b) this.f6170b.get();
            date2 = date;
            try {
                g gVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, bVar != null ? (Long) ((r9.c) bVar).f8232a.f10615a.zzr(null, null, true).get("_fot") : null, date2);
                e eVar = gVarFetch.f6166b;
                if (eVar != null) {
                    k kVar = this.f6174g;
                    long j4 = eVar.f6160f;
                    synchronized (kVar.f6184b) {
                        kVar.f6183a.edit().putLong("last_template_version", j4).apply();
                    }
                }
                String str4 = gVarFetch.f6167c;
                if (str4 != null) {
                    k kVar2 = this.f6174g;
                    synchronized (kVar2.f6184b) {
                        kVar2.f6183a.edit().putString("last_fetch_etag", str4).apply();
                    }
                }
                this.f6174g.c(0, k.f6182f);
                return gVarFetch;
            } catch (jb.f e) {
                e = e;
                jb.f fVar = e;
                int i10 = fVar.f5741a;
                k kVar3 = this.f6174g;
                if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                    int i11 = kVar3.a().f6180a + 1;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    int[] iArr = f6168j;
                    long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                    kVar3.c(i11, new Date(date2.getTime() + (millis / 2) + ((long) this.f6172d.nextInt((int) millis))));
                }
                j jVarA = kVar3.a();
                int i12 = fVar.f5741a;
                if (jVarA.f6180a > 1 || i12 == 429) {
                    jVarA.f6181b.getTime();
                    throw new jb.e("Fetch was throttled.");
                }
                if (i12 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i12 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else {
                    if (i12 == 429) {
                        throw new jb.c("The throttled response from the server was not handled correctly by the FRC SDK.");
                    }
                    if (i12 != 500) {
                        switch (i12) {
                            case 502:
                            case 503:
                            case 504:
                                str3 = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str3 = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str3 = "There was an internal server error.";
                    }
                }
                throw new jb.f(fVar.f5741a, "Fetch failed: ".concat(str3), fVar);
            }
        } catch (jb.f e4) {
            e = e4;
            date2 = date;
        }
    }

    public final Task b(Task task, long j4, final HashMap map) {
        Task taskContinueWithTask;
        boolean zBefore;
        final Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        k kVar = this.f6174g;
        if (zIsSuccessful) {
            Date date2 = new Date(kVar.f6183a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(k.e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j4) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new g(2, null, null));
            }
        }
        Date date3 = kVar.a().f6181b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f6171c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new jb.e(str));
        } else {
            za.c cVar = (za.c) this.f6169a;
            final Task taskC = cVar.c();
            final Task taskD = cVar.d();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskD}).continueWithTask(executor, new Continuation() { // from class: kb.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    h hVar = this.f6161a;
                    Date date5 = date;
                    HashMap map2 = map;
                    Task task3 = taskC;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new jb.c("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = taskD;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new jb.c("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        g gVarA = hVar.a((String) task3.getResult(), ((za.a) task4.getResult()).f11531a, date5, map2);
                        return gVarA.f6165a != 0 ? Tasks.forResult(gVarA) : hVar.e.c(gVarA.f6166b).onSuccessTask(hVar.f6171c, new a5.a(gVarA, 17));
                    } catch (jb.d e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new e5.c(16, this, date));
    }

    public final Task c(int i10) {
        HashMap map = new HashMap(this.h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i10);
        return this.e.b().continueWithTask(this.f6171c, new e5.c(15, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        r9.b bVar = (r9.b) this.f6170b.get();
        if (bVar != null) {
            for (Map.Entry entry : ((r9.c) bVar).f8232a.f10615a.zzr(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
