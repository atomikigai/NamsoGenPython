package e5;

import android.app.Application;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.widget.ProgressBar;
import bd.v;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import gb.s;
import h3.f0;
import h3.g0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l5.l;
import q3.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements OnFailureListener, OnCompleteListener, SuccessContinuation, m, Continuation, t5.b, s5.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3285d;

    public /* synthetic */ d(g gVar, a5.b bVar, String str, String str2) {
        this.f3282a = 2;
        this.f3283b = gVar;
        this.f3284c = str;
        this.f3285d = str2;
    }

    @Override // s5.g
    public Object apply(Object obj) throws Throwable {
        Cursor cursor;
        String str;
        long jInsert;
        o5.c cVar;
        int i = this.f3282a;
        String str2 = "bytes";
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        o5.c cVar2 = o5.c.CACHE_FULL;
        int i13 = 2;
        Object obj2 = this.f3285d;
        Object obj3 = this.f3284c;
        int i14 = 0;
        s5.i iVar = (s5.i) this.f3283b;
        switch (i) {
            case 9:
                ArrayList arrayList = (ArrayList) obj3;
                l5.i iVar2 = (l5.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    boolean z4 = cursor2.getInt(7) != 0;
                    v vVar = new v(8);
                    vVar.f1685g = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    vVar.f1681b = string;
                    vVar.e = Long.valueOf(cursor2.getLong(i13));
                    vVar.f1684f = Long.valueOf(cursor2.getLong(3));
                    if (z4) {
                        String string2 = cursor2.getString(4);
                        vVar.f1683d = new l(string2 == null ? s5.i.f8438f : new i5.b(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        i5.b bVar = string3 == null ? s5.i.f8438f : new i5.b(string3);
                        Cursor cursorQuery = iVar.c().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i15 = 0;
                            int length2 = 0;
                            while (i15 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i15);
                                String str3 = str2;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                    length2 += bArr2.length;
                                    i15++;
                                    cursorQuery = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            cursorQuery.close();
                            vVar.f1683d = new l(bVar, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        vVar.f1682c = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new s5.b(j4, iVar2, vVar.e()));
                    str2 = str;
                    i13 = 2;
                }
                return null;
            case 10:
                l5.h hVar = (l5.h) obj3;
                l lVar = hVar.f6819c;
                String str4 = hVar.f6817a;
                l5.i iVar3 = (l5.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = iVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong();
                s5.a aVar = iVar.f8442d;
                if (jSimpleQueryForLong >= aVar.f8426a) {
                    iVar.B(1L, cVar2, str4);
                    return -1L;
                }
                Long lD = s5.i.d(sQLiteDatabase, iVar3);
                if (lD != null) {
                    jInsert = lD.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar3.f6822a);
                    contentValues.put("priority", Integer.valueOf(v5.a.a(iVar3.f6824c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = iVar3.f6823b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.e;
                byte[] bArr4 = lVar.f6831b;
                boolean z10 = bArr4.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f6820d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.e));
                contentValues2.put("payload_encoding", lVar.f6830a.f5208a);
                contentValues2.put("code", hVar.f6818b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i16));
                    for (int i17 = 1; i17 <= iCeil; i17++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i17 - 1) * i16, Math.min(i17 * i16, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f6821f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                a3.j jVar = (a3.j) obj2;
                ArrayList arrayList3 = (ArrayList) jVar.f108b;
                Cursor cursor3 = (Cursor) obj;
                iVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i14);
                    int i18 = cursor3.getInt(1);
                    o5.c cVar3 = o5.c.REASON_UNKNOWN;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            cVar3 = o5.c.MESSAGE_TOO_OLD;
                        } else if (i18 == 2) {
                            cVar = cVar2;
                        } else if (i18 == i12) {
                            cVar3 = o5.c.PAYLOAD_TOO_BIG;
                        } else if (i18 == i11) {
                            cVar3 = o5.c.MAX_RETRIES_REACHED;
                        } else if (i18 == i10) {
                            cVar3 = o5.c.INVALID_PAYLOD;
                        } else if (i18 == 6) {
                            cVar3 = o5.c.SERVER_ERROR;
                        } else {
                            a.a.e(Integer.valueOf(i18), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar3;
                    } else {
                        cVar = cVar3;
                    }
                    long j10 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new o5.d(j10, cVar));
                    i14 = 0;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i19 = o5.e.f7573c;
                    new ArrayList();
                    arrayList3.add(new o5.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jD = iVar.f8440b.d();
                SQLiteDatabase sQLiteDatabaseC = iVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        o5.g gVar = new o5.g(cursorRawQuery.getLong(0), jD);
                        cursorRawQuery.close();
                        sQLiteDatabaseC.setTransactionSuccessful();
                        sQLiteDatabaseC.endTransaction();
                        jVar.f107a = gVar;
                        jVar.f109c = new o5.b(new o5.f(iVar.c().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.c().compileStatement("PRAGMA page_count").simpleQueryForLong(), s5.a.f8425f.f8426a));
                        jVar.f110d = (String) iVar.e.get();
                        return new o5.a((o5.g) jVar.f107a, Collections.unmodifiableList(arrayList3), (o5.b) jVar.f109c, (String) jVar.f110d);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseC.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // q3.m
    public void e(Object obj) {
        String str = (String) this.f3283b;
        String str2 = (String) this.f3284c;
        String str3 = (String) this.f3285d;
        StringBuilder sbE = u3.b.e("Guardado: ", str, " (", str2, ") -> ");
        sbE.append(str3);
        Log.d("CheckerCache", sbE.toString());
    }

    @Override // t5.b
    public Object f() {
        q5.b bVar = (q5.b) this.f3283b;
        l5.i iVar = (l5.i) this.f3284c;
        l5.h hVar = (l5.h) this.f3285d;
        s5.i iVar2 = (s5.i) bVar.f8038d;
        iVar2.getClass();
        i5.c cVar = iVar.f6824c;
        String str = hVar.f6817a;
        String str2 = iVar.f6822a;
        String strH = a.a.h("SQLiteEventStore");
        if (Log.isLoggable(strH, 3)) {
            Log.d(strH, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) iVar2.g(new d(iVar2, hVar, iVar, 10))).getClass();
        bVar.f8035a.i(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f3282a) {
            case 1:
                f fVar = (f) this.f3283b;
                a5.c cVar = (a5.c) this.f3284c;
                v9.d dVar = (v9.d) this.f3285d;
                Application applicationC = fVar.c();
                cVar.getClass();
                a5.c.a(applicationC);
                if (task.isSuccessful()) {
                    fVar.g(dVar);
                    return;
                } else {
                    fVar.f(s4.h.a(task.getException()));
                    return;
                }
            case 4:
                jb.b bVar = (jb.b) this.f3283b;
                String str = (String) this.f3284c;
                g0 g0Var = (g0) this.f3285d;
                jc.i.e(task, "task");
                if (task.isSuccessful()) {
                    StringBuilder sbE = u3.b.e("https://api11.scamalytics.com/", bVar.c("user_id_ip_fraud"), "/?key=", bVar.c("api_key_ip_fraud"), "&ip=");
                    sbE.append(str);
                    com.bumptech.glide.d.v(g0Var.U()).a(new r3.e(0, sbE.toString(), null, new f0(g0Var, 2), new f0(g0Var, 3)));
                    return;
                }
                ProgressBar progressBar = g0Var.k0;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    jc.i.i("loader");
                    throw null;
                }
            default:
                w4.c cVar2 = (w4.c) this.f3283b;
                String str2 = (String) this.f3284c;
                Credential credential = (Credential) this.f3285d;
                cVar2.getClass();
                if (task.isSuccessful()) {
                    cVar2.f(s4.h.c(new s4.i((String) task.getResult(), str2, null, credential.f1982b, credential.f1983c)));
                    return;
                } else {
                    cVar2.f(s4.h.a(task.getException()));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f3282a) {
            case 0:
                f fVar = (f) this.f3283b;
                a5.c cVar = (a5.c) this.f3284c;
                v9.e eVar = (v9.e) this.f3285d;
                Application applicationC = fVar.c();
                cVar.getClass();
                a5.c.a(applicationC);
                if (!(exc instanceof v9.l)) {
                    fVar.f(s4.h.a(exc));
                } else {
                    fVar.g(eVar);
                }
                break;
            default:
                g gVar = (g) this.f3283b;
                String str = (String) this.f3284c;
                String str2 = (String) this.f3285d;
                if (!(exc instanceof v9.l)) {
                    gVar.f(s4.h.a(exc));
                } else if (!a5.b.s(gVar.i, (s4.c) gVar.f2923f)) {
                    Log.w("EmailProviderResponseHa", "Got a collision error during a non-upgrade flow", exc);
                    com.bumptech.glide.d.l(gVar.i, (s4.c) gVar.f2923f, str).continueWithTask(new a5.f(0)).addOnSuccessListener(new aa.c(gVar, str, 22, false)).addOnFailureListener(new a5.a(gVar, 4));
                } else {
                    i0.e(str);
                    i0.e(str2);
                    gVar.g(new v9.e(str, str2, null, null, false));
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        kb.e eVar;
        URL url;
        switch (this.f3282a) {
            case 6:
                jb.b bVar = (jb.b) this.f3283b;
                Task task2 = (Task) this.f3284c;
                Task task3 = (Task) this.f3285d;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                kb.e eVar2 = (kb.e) task2.getResult();
                return (task3.isSuccessful() && (eVar = (kb.e) task3.getResult()) != null && eVar2.f6158c.equals(eVar.f6158c)) ? Tasks.forResult(Boolean.FALSE) : bVar.f5738d.c(eVar2).continueWith(bVar.f5736b, new jb.a(bVar));
            default:
                kb.m mVar = (kb.m) this.f3283b;
                Task task4 = (Task) this.f3284c;
                Task task5 = (Task) this.f3285d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new jb.c("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new jb.c("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(mVar.c(mVar.f6198l));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    mVar.i(httpURLConnection, (String) task5.getResult(), ((za.a) task4.getResult()).f11531a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new jb.c("Failed to open HTTP stream connection", e));
                }
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f3282a = i;
        this.f3283b = obj;
        this.f3284c = obj2;
        this.f3285d = obj3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String strF;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3283b;
        String str = (String) this.f3284c;
        s sVar = (s) this.f3285d;
        String str2 = (String) obj;
        ib.c cVarD = FirebaseMessaging.d(firebaseMessaging.f2730b);
        n9.g gVar = firebaseMessaging.f2729a;
        gVar.a();
        if ("[DEFAULT]".equals(gVar.f7360b)) {
            strF = "";
        } else {
            strF = gVar.f();
        }
        String strA = firebaseMessaging.f2735j.a();
        synchronized (cVarD) {
            String strA2 = s.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) cVarD.f5256b).edit();
                editorEdit.putString(strF + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.f4498a)) {
            n9.g gVar2 = firebaseMessaging.f2729a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f7360b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb2.append(gVar2.f7360b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new gb.j(firebaseMessaging.f2730b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
