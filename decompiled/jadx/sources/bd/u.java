package bd;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfkl;
import com.google.android.gms.internal.ads.zzgee;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import fa.h0;
import fa.l1;
import fa.m1;
import fa.n1;
import fa.o0;
import i5.f;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.logging.Logger;
import l5.h;
import l5.i;
import m5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements zzgee, n5.b, x9.e, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1678d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1679f;

    public /* synthetic */ u(int i) {
        this.f1675a = i;
    }

    public static u e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        u uVar = new u(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) uVar.e)) {
            try {
                ((ArrayDeque) uVar.e).clear();
                String string = ((SharedPreferences) uVar.f1677c).getString((String) uVar.f1676b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) uVar.f1678d)) {
                    String[] strArrSplit = string.split((String) uVar.f1678d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) uVar.e).add(str);
                        }
                    }
                    return uVar;
                }
                return uVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static u g(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_premium_country, viewGroup, false);
        int i = R.id.iv_country_flag;
        ImageView imageView = (ImageView) r7.g.o(viewInflate, R.id.iv_country_flag);
        if (imageView != null) {
            i = R.id.tv_country_action;
            TextView textView = (TextView) r7.g.o(viewInflate, R.id.tv_country_action);
            if (textView != null) {
                i = R.id.tv_country_name;
                TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_country_name);
                if (textView2 != null) {
                    i = R.id.tv_country_subtitle;
                    TextView textView3 = (TextView) r7.g.o(viewInflate, R.id.tv_country_subtitle);
                    if (textView3 != null) {
                        return new u((LinearLayout) viewInflate, imageView, textView, textView2, textView3, 4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public v a() {
        Map mapUnmodifiableMap;
        o oVar = (o) this.f1677c;
        if (oVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1676b;
        m mVarB = ((l) this.f1678d).b();
        bb.b bVar = (bb.b) this.e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1679f;
        byte[] bArr = cd.b.f1822a;
        jc.i.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = vb.r.f9298a;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            jc.i.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new v(oVar, str, mVarB, bVar, mapUnmodifiableMap);
    }

    public h0 b() {
        String strH = ((Long) this.f1677c) == null ? " timestamp" : "";
        if (((String) this.f1676b) == null) {
            strH = strH.concat(" type");
        }
        if (((l1) this.f1678d) == null) {
            strH = da.v.h(strH, " app");
        }
        if (((m1) this.e) == null) {
            strH = da.v.h(strH, " device");
        }
        if (strH.isEmpty()) {
            return new h0(((Long) this.f1677c).longValue(), (String) this.f1676b, (l1) this.f1678d, (m1) this.e, (n1) this.f1679f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strH));
    }

    public o0 c() {
        String strH = ((Long) this.f1677c) == null ? " pc" : "";
        if (((String) this.f1676b) == null) {
            strH = strH.concat(" symbol");
        }
        if (((Long) this.e) == null) {
            strH = da.v.h(strH, " offset");
        }
        if (((Integer) this.f1679f) == null) {
            strH = da.v.h(strH, " importance");
        }
        if (!strH.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strH));
        }
        return new o0(((Integer) this.f1679f).intValue(), ((Long) this.f1677c).longValue(), ((Long) this.e).longValue(), (String) this.f1676b, (String) this.f1678d);
    }

    @Override // x9.e
    public Object d(x9.s sVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((x9.q) this.f1677c, (x9.q) this.f1676b, (x9.q) this.f1678d, (x9.q) this.e, (x9.q) this.f1679f, sVar);
    }

    public void f(String str, String str2) {
        jc.i.e(str2, "value");
        l lVar = (l) this.f1678d;
        lVar.getClass();
        qd.b.i(str);
        qd.b.k(str2, str);
        lVar.c(str);
        lVar.a(str, str2);
    }

    @Override // tb.a
    public Object get() {
        return new q5.b((Executor) ((tb.a) this.f1677c).get(), (m5.d) ((tb.a) this.f1676b).get(), (q5.d) ((q5.d) this.f1678d).get(), (s5.d) ((tb.a) this.e).get(), (t5.c) ((tb.a) this.f1679f).get());
    }

    public void h(String str, bb.b bVar) {
        jc.i.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (bVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(da.v.i("method ", str, " must have a request body.").toString());
            }
        } else if (!android.support.v4.media.session.a.u(str)) {
            throw new IllegalArgumentException(da.v.i("method ", str, " must not have a request body.").toString());
        }
        this.f1676b = str;
        this.e = bVar;
    }

    public void i(i5.a aVar, final i5.f fVar) {
        l5.q qVar = (l5.q) this.f1679f;
        l5.i iVar = (l5.i) this.f1677c;
        String str = (String) this.f1676b;
        i5.d dVar = (i5.d) this.e;
        if (dVar == null) {
            throw new NullPointerException("Null transformer");
        }
        i5.b bVar = (i5.b) this.f1678d;
        q5.c cVar = qVar.f6841c;
        final l5.i iVarB = iVar.b(aVar.f5207b);
        v vVar = new v(8);
        vVar.f1685g = new HashMap();
        vVar.e = Long.valueOf(qVar.f6839a.d());
        vVar.f1684f = Long.valueOf(qVar.f6840b.d());
        vVar.f1681b = str;
        vVar.f1683d = new l5.l(bVar, (byte[]) dVar.apply(aVar.f5206a));
        vVar.f1682c = null;
        final l5.h hVarE = vVar.e();
        final q5.b bVar2 = (q5.b) cVar;
        bVar2.f8036b.execute(new Runnable() { // from class: q5.a
            @Override // java.lang.Runnable
            public final void run() {
                i iVar2 = iVarB;
                String str2 = iVar2.f6822a;
                f fVar2 = fVar;
                h hVar = hVarE;
                b bVar3 = bVar2;
                bVar3.getClass();
                Logger logger = b.f8034f;
                try {
                    e eVarA = bVar3.f8037c.a(str2);
                    if (eVarA != null) {
                        ((s5.i) bVar3.e).E(new e5.d(bVar3, iVar2, ((j5.c) eVarA).a(hVar), 8));
                        fVar2.f(null);
                        return;
                    }
                    String str3 = "Transport backend '" + str2 + "' is not registered";
                    logger.warning(str3);
                    fVar2.f(new IllegalArgumentException(str3));
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    fVar2.f(e);
                }
            }
        });
    }

    public void j(String str) {
        jc.i.e(str, "url");
        if (pc.o.e0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            jc.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (pc.o.e0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            jc.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        jc.i.e(str, "<this>");
        n nVar = new n();
        nVar.i(null, str);
        this.f1677c = nVar.a();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        w9.v vVar = (w9.v) this.f1677c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1676b;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1678d;
        w9.s sVar = (w9.s) this.e;
        androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f1679f;
        vVar.getClass();
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new w9.u(null, ((IntegrityTokenResponse) task.getResult()).token()));
        } else {
            Log.e("v", "Play Integrity Token fetch failed, falling back to Recaptcha".concat(String.valueOf(task.getException() == null ? "" : task.getException().getMessage())));
            w9.v.a(firebaseAuth, sVar, wVar, taskCompletionSource);
        }
    }

    public String toString() {
        switch (this.f1675a) {
            case 7:
                List list = (List) this.e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + ((String) this.f1676b) + ", mProviderPackage: " + ((String) this.f1677c) + ", mQuery: " + ((String) this.f1678d) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb2.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i10 = 0; i10 < list2.size(); i10++) {
                        sb2.append(" \"");
                        sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                        sb2.append("\"");
                    }
                    sb2.append(" ]");
                }
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhr)).booleanValue()) {
            d6.p.C.f2982g.zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            d6.p.C.f2982g.zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfkl zzfklVarQ = o6.i.Q((m9.a) this.f1677c, (zzbzl) this.f1676b);
        if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzfklVarQ != null) {
            zzfka zzfkaVar = (zzfka) this.e;
            zzfkaVar.zzh(th);
            zzfkaVar.zzg(false);
            zzfklVarQ.zza(zzfkaVar);
            zzfklVarQ.zzh();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            ((zzbze) this.f1678d).zzb(message);
        } catch (RemoteException e) {
            i6.h.e("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public void zzb(Object obj) {
        zzbze zzbzeVar = (zzbze) this.f1678d;
        zzfka zzfkaVar = (zzfka) this.e;
        o6.r rVar = (o6.r) obj;
        zzfkl zzfklVarQ = o6.i.Q((m9.a) this.f1677c, (zzbzl) this.f1676b);
        o6.i iVar = (o6.i) this.f1679f;
        iVar.M.set(true);
        if (!((Boolean) e6.t.f3437d.f3440c.zza(zzbcn.zzhm)).booleanValue()) {
            try {
                zzbzeVar.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                i6.h.d("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbeg.zze.zze()).booleanValue() || zzfklVarQ == null) {
                return;
            }
            zzfkaVar.zzc("QueryInfo generation has been disabled.");
            zzfkaVar.zzg(false);
            zzfklVarQ.zza(zzfkaVar);
            zzfklVarQ.zzh();
            return;
        }
        try {
            if (rVar == null) {
                zzbzeVar.zzc(null, null, null);
                zzfkaVar.zzg(true);
                if (!((Boolean) zzbeg.zze.zze()).booleanValue() || zzfklVarQ == null) {
                    return;
                }
                zzfklVarQ.zza(zzfkaVar);
                zzfklVarQ.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty(new JSONObject(rVar.f7663b).optString("request_id", ""))) {
                    i6.h.g("The request ID is empty in request JSON.");
                    zzbzeVar.zzb("Internal error: request ID is empty in request JSON.");
                    zzfkaVar.zzc("Request ID empty");
                    zzfkaVar.zzg(false);
                    if (!((Boolean) zzbeg.zze.zze()).booleanValue() || zzfklVarQ == null) {
                        return;
                    }
                    zzfklVarQ.zza(zzfkaVar);
                    zzfklVarQ.zzh();
                    return;
                }
                Bundle bundle = rVar.f7665d;
                if (iVar.A && bundle != null && bundle.getInt(iVar.C, -1) == -1) {
                    bundle.putInt(iVar.C, iVar.D.get());
                }
                if (iVar.f7635z && bundle != null && TextUtils.isEmpty(bundle.getString(iVar.B))) {
                    if (TextUtils.isEmpty(iVar.F)) {
                        iVar.F = d6.p.C.f2979c.w(iVar.f7623b, iVar.E.f5213a);
                    }
                    bundle.putString(iVar.B, iVar.F);
                }
                zzbzeVar.zzc(rVar.f7662a, rVar.f7663b, bundle);
                zzfkaVar.zzg(true);
                if (!((Boolean) zzbeg.zze.zze()).booleanValue() || zzfklVarQ == null) {
                    return;
                }
                zzfklVarQ.zza(zzfkaVar);
                zzfklVarQ.zzh();
            } catch (JSONException e4) {
                i6.h.g("Failed to create JSON object from the request string.");
                zzbzeVar.zzb("Internal error for request JSON: " + e4.toString());
                zzfkaVar.zzh(e4);
                zzfkaVar.zzg(false);
                d6.p.C.f2982g.zzw(e4, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbeg.zze.zze()).booleanValue() || zzfklVarQ == null) {
                    return;
                }
                zzfklVarQ.zza(zzfkaVar);
                zzfklVarQ.zzh();
            }
        } catch (RemoteException e10) {
            zzfkaVar.zzh(e10);
            zzfkaVar.zzg(false);
            i6.h.e("", e10);
            d6.p.C.f2982g.zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbeg.zze.zze()).booleanValue() && zzfklVarQ != null) {
                zzfklVarQ.zza(zzfkaVar);
                zzfklVarQ.zzh();
            }
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f1675a = i;
        this.f1677c = obj;
        this.f1676b = obj2;
        this.f1678d = obj3;
        this.e = obj4;
        this.f1679f = obj5;
    }

    public u(o6.i iVar, m9.a aVar, zzbzl zzbzlVar, zzbze zzbzeVar, zzfka zzfkaVar) {
        this.f1675a = 8;
        this.f1677c = aVar;
        this.f1676b = zzbzlVar;
        this.f1678d = zzbzeVar;
        this.e = zzfkaVar;
        this.f1679f = iVar;
    }

    public /* synthetic */ u(boolean z4) {
        this.f1675a = 0;
    }

    public u(String str, String str2, String str3, List list) {
        this.f1675a = 7;
        str.getClass();
        this.f1676b = str;
        str2.getClass();
        this.f1677c = str2;
        this.f1678d = str3;
        list.getClass();
        this.e = list;
        this.f1679f = da.v.k(str, "-", str2, "-", str3);
    }

    public u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1675a = 3;
        this.e = new ArrayDeque();
        this.f1677c = sharedPreferences;
        this.f1676b = "topic_operation_queue";
        this.f1678d = ",";
        this.f1679f = scheduledThreadPoolExecutor;
    }

    public u() {
        this.f1675a = 0;
        this.f1679f = new LinkedHashMap();
        this.f1676b = "GET";
        this.f1678d = new l(0);
    }
}
