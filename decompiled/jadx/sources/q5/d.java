package q5;

import android.animation.ValueAnimator;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.w;
import androidx.work.OverwritingInputMerger;
import c3.i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.p002firebaseauthapi.zzaee;
import com.google.android.gms.internal.p002firebaseauthapi.zzafn;
import com.google.android.gms.internal.p002firebaseauthapi.zzahl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import g6.m;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.zip.Adler32;
import n9.g;
import r7.k;
import t0.f;
import t2.e;
import t2.n;
import v9.i0;
import v9.j0;
import w9.u;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n5.b, f, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8041c;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3) {
        this.f8039a = obj;
        this.f8040b = obj2;
        this.f8041c = obj3;
    }

    @Override // t0.f
    public Uri a() {
        return (Uri) this.f8039a;
    }

    @Override // t0.f
    public Uri c() {
        return (Uri) this.f8041c;
    }

    @Override // t0.f
    public Object d() {
        return null;
    }

    public void e(int[] iArr, ValueAnimator valueAnimator) {
        k kVar = new k();
        valueAnimator.addListener((m) this.f8041c);
        ((ArrayList) this.f8039a).add(kVar);
    }

    public n f() {
        UUID uuid = (UUID) this.f8039a;
        i iVar = (i) this.f8040b;
        HashSet hashSet = (HashSet) this.f8041c;
        n nVar = new n();
        nVar.f8552a = uuid;
        nVar.f8553b = iVar;
        nVar.f8554c = hashSet;
        t2.c cVar = iVar.f1750j;
        boolean z4 = cVar.h.f8540a.size() > 0 || cVar.f8535d || cVar.f8533b || cVar.f8534c;
        if (((i) this.f8040b).f1757q && z4) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f8039a = UUID.randomUUID();
        i iVar2 = (i) this.f8040b;
        i iVar3 = new i();
        iVar3.f1745b = 1;
        t2.f fVar = t2.f.f8542c;
        iVar3.e = fVar;
        iVar3.f1748f = fVar;
        iVar3.f1750j = t2.c.i;
        iVar3.f1752l = 1;
        iVar3.f1753m = 30000L;
        iVar3.f1756p = -1L;
        iVar3.f1758r = 1;
        iVar3.f1744a = iVar2.f1744a;
        iVar3.f1746c = iVar2.f1746c;
        iVar3.f1745b = iVar2.f1745b;
        iVar3.f1747d = iVar2.f1747d;
        iVar3.e = new t2.f(iVar2.e);
        iVar3.f1748f = new t2.f(iVar2.f1748f);
        iVar3.f1749g = iVar2.f1749g;
        iVar3.h = iVar2.h;
        iVar3.i = iVar2.i;
        t2.c cVar2 = iVar2.f1750j;
        t2.c cVar3 = new t2.c();
        cVar3.f8532a = 1;
        cVar3.f8536f = -1L;
        cVar3.f8537g = -1L;
        cVar3.h = new e();
        cVar3.f8533b = cVar2.f8533b;
        cVar3.f8534c = cVar2.f8534c;
        cVar3.f8532a = cVar2.f8532a;
        cVar3.f8535d = cVar2.f8535d;
        cVar3.e = cVar2.e;
        cVar3.h = cVar2.h;
        iVar3.f1750j = cVar3;
        iVar3.f1751k = iVar2.f1751k;
        iVar3.f1752l = iVar2.f1752l;
        iVar3.f1753m = iVar2.f1753m;
        iVar3.f1754n = iVar2.f1754n;
        iVar3.f1755o = iVar2.f1755o;
        iVar3.f1756p = iVar2.f1756p;
        iVar3.f1757q = iVar2.f1757q;
        iVar3.f1758r = iVar2.f1758r;
        this.f8040b = iVar3;
        iVar3.f1744a = ((UUID) this.f8039a).toString();
        return nVar;
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f8039a;
        ua.f fVar = new ua.f(byteArrayOutputStream, map, (HashMap) this.f8040b, (ra.d) this.f8041c);
        if (obj == null) {
            return;
        }
        ra.d dVar = (ra.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new ra.b("No encoder for " + obj.getClass());
        }
    }

    @Override // tb.a
    public Object get() {
        return new d((Context) ((tb.a) this.f8039a).get(), (s5.d) ((tb.a) this.f8040b).get(), (r5.a) ((z9.c) this.f8041c).get());
    }

    @Override // t0.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f8040b;
    }

    public boolean h(int i, w.d dVar, z.e eVar) {
        x.b bVar = (x.b) this.f8040b;
        int[] iArr = dVar.f9392p0;
        int[] iArr2 = dVar.f9396t;
        bVar.f9967a = iArr[0];
        bVar.f9968b = iArr[1];
        bVar.f9969c = dVar.q();
        bVar.f9970d = dVar.k();
        bVar.i = false;
        bVar.f9973j = i;
        boolean z4 = bVar.f9967a == 3;
        boolean z10 = bVar.f9968b == 3;
        boolean z11 = z4 && dVar.W > 0.0f;
        boolean z12 = z10 && dVar.W > 0.0f;
        if (z11 && iArr2[0] == 4) {
            bVar.f9967a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f9968b = 1;
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.e);
        dVar.L(bVar.f9971f);
        dVar.E = bVar.h;
        dVar.I(bVar.f9972g);
        bVar.f9973j = 0;
        return bVar.i;
    }

    public void i(l5.i iVar, int i, boolean z4) {
        r5.a aVar = (r5.a) this.f8041c;
        Context context = (Context) this.f8039a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f6822a;
        String str2 = iVar.f6822a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        i5.c cVar = iVar.f6824c;
        adler32.update(byteBufferAllocate.putInt(v5.a.a(cVar)).array());
        byte[] bArr = iVar.f6823b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z4) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i10 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i10 < i) {
                        break;
                    }
                    a.a.e(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((s5.i) ((s5.d) this.f8040b)).c().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(v5.a.a(cVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(cVar, jLongValue, i));
            Set set = ((r5.b) aVar.f8173b.get(cVar)).f8176c;
            if (set.contains(r5.c.f8177a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(r5.c.f8179c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(r5.c.f8178b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", v5.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(cVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strH = a.a.h("JobInfoScheduler");
            if (Log.isLoggable(strH, 3)) {
                Log.d(strH, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void j(w.e eVar, int i, int i10, int i11) {
        int i12 = eVar.f9368b0;
        int i13 = eVar.f9370c0;
        eVar.f9368b0 = 0;
        eVar.f9370c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f9368b0 = 0;
        } else {
            eVar.f9368b0 = i12;
        }
        if (i13 < 0) {
            eVar.f9370c0 = 0;
        } else {
            eVar.f9370c0 = i13;
        }
        w.e eVar2 = (w.e) this.f8041c;
        eVar2.f9406t0 = i;
        eVar2.U();
    }

    public void k(w.e eVar) {
        ArrayList arrayList = (ArrayList) this.f8039a;
        arrayList.clear();
        int size = eVar.f9403q0.size();
        for (int i = 0; i < size; i++) {
            w.d dVar = (w.d) eVar.f9403q0.get(i);
            int[] iArr = dVar.f9392p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f9405s0.f9977b = true;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String str;
        String str2;
        v1.b bVar = (v1.b) this.f8039a;
        j0 j0Var = (j0) bVar.f9120f;
        if (task.isSuccessful()) {
            String str3 = ((u) task.getResult()).f9860a;
            str = ((u) task.getResult()).f9861b;
            str2 = str3;
        } else {
            Exception exception = task.getException();
            if (exception instanceof v9.k) {
                String str4 = (String) this.f8040b;
                Log.e("FirebaseAuth", "Invoking verification failure callback with MissingActivity exception for phone number/uid - ".concat(String.valueOf(str4)));
                bVar.f9116a.execute(new i0(0, zzafn.zza(str4, j0Var, null), (v9.k) exception));
                return;
            }
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(task.getException() != null ? task.getException().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f8041c;
        firebaseAuth.getClass();
        long jLongValue = ((Long) bVar.e).longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str5 = bVar.f9117b;
        com.google.android.gms.common.internal.i0.e(str5);
        boolean z4 = ((v9.u) bVar.h) != null;
        String str6 = firebaseAuth.i;
        String str7 = firebaseAuth.f2705k;
        g gVar = firebaseAuth.f2698a;
        gVar.a();
        zzahl zzahlVar = new zzahl(str5, jLongValue, z4, str6, str7, str2, str, zzaee.zza(gVar.f7359a));
        firebaseAuth.f2703g.getClass();
        if (TextUtils.isEmpty(str2) && !bVar.f9118c) {
            j0Var = new j0(firebaseAuth, bVar, j0Var);
        }
        firebaseAuth.e.zzT(firebaseAuth.f2698a, zzahlVar, j0Var, (w) bVar.f9121g, bVar.f9116a);
    }

    public d(Class cls) {
        HashSet hashSet = new HashSet();
        this.f8041c = hashSet;
        this.f8039a = UUID.randomUUID();
        this.f8040b = new i(((UUID) this.f8039a).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((i) this.f8040b).f1747d = OverwritingInputMerger.class.getName();
    }

    public d(int i) {
        switch (i) {
            case 6:
                this.f8039a = new ArrayList();
                this.f8040b = null;
                this.f8041c = new m(this, 8);
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f8039a = list;
                this.f8040b = list;
                break;
        }
    }

    public d(w3.k kVar, l4.f fVar, w3.n nVar) {
        this.f8041c = kVar;
        this.f8040b = fVar;
        this.f8039a = nVar;
    }

    @Override // t0.f
    public void b() {
    }
}
