package z9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.w;
import b9.e;
import bd.t;
import com.bumptech.glide.manager.g;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d4.n;
import i5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jc.i;
import od.f;
import org.json.JSONException;
import org.json.JSONObject;
import r7.j;
import t2.m;
import vb.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ba.a, g, n, SuccessContinuation, ka.c, l6.b, d, q4.c, n5.b, r7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f11530a;

    public static ArrayList h(List list) {
        i.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.U(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((t) obj2).f1674a);
        }
        return arrayList2;
    }

    public static byte[] i(List list) {
        i.e(list, "protocols");
        f fVar = new f();
        ArrayList arrayListH = h(list);
        int size = arrayListH.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListH.get(i);
            i++;
            String str = (String) obj;
            fVar.V(str.length());
            fVar.a0(str);
        }
        return fVar.B(fVar.f7734b);
    }

    public static c j(Context context, int i) {
        qd.b.e("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, d8.a.f3029u);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 4);
        android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 9);
        android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        b9.k.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new b9.a(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        c cVar = new c();
        qd.b.g(rect.left);
        qd.b.g(rect.top);
        qd.b.g(rect.right);
        qd.b.g(rect.bottom);
        return cVar;
    }

    public static od.i k(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i * 2;
            bArr[i] = (byte) (pd.b.a(str.charAt(i10 + 1)) + (pd.b.a(str.charAt(i10)) << 4));
        }
        return new od.i(bArr);
    }

    public static od.i l(String str) {
        i.e(str, "<this>");
        byte[] bytes = str.getBytes(pc.a.f7846a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        od.i iVar = new od.i(bytes);
        iVar.f7738c = str;
        return iVar;
    }

    public static boolean m() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    @Override // i5.d
    public Object apply(Object obj) {
        return ((zzji) obj).zzM();
    }

    @Override // r7.c
    public int c(Context context, String str, boolean z4) {
        return r7.f.d(context, str, z4);
    }

    @Override // ka.c
    public ka.b f(e eVar, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        m mVar = jSONObject.has("session") ? new m(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new m(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        ka.a aVar = new ka.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j4 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            jCurrentTimeMillis = (j4 * 1000) + System.currentTimeMillis();
        }
        return new ka.b(jCurrentTimeMillis, mVar, aVar, dOptDouble, dOptDouble2, iOptInt2);
    }

    @Override // r7.c
    public int g(Context context, String str) {
        return r7.f.a(context, str);
    }

    @Override // tb.a
    public Object get() {
        j jVar = new j();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(i5.c.f5209a, new r5.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(i5.c.f5211c, new r5.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(r5.c.f8178b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(i5.c.f5210b, new r5.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < i5.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new r5.a(jVar, map);
    }

    @Override // ba.a
    public void p(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override // d4.n
    public void d() {
    }

    @Override // com.bumptech.glide.manager.g
    public void b(w wVar) {
    }

    @Override // q4.c
    public void e(Object obj) {
    }

    @Override // d4.n
    public void a(Bitmap bitmap, x3.a aVar) {
    }
}
