package w9;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.p002firebaseauthapi.zzab;
import com.google.android.gms.internal.p002firebaseauthapi.zzj;
import com.google.android.gms.internal.p002firebaseauthapi.zzzr;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j7.a f9847a = new j7.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objD = jSONArray.get(i);
            if (objD instanceof JSONArray) {
                objD = a((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    public static Map b(String str) {
        i0.e(str);
        List listZzd = zzab.zzb(zzj.zzb('.')).zzd(str);
        int size = listZzd.size();
        j7.a aVar = f9847a;
        if (size < 2) {
            aVar.c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) listZzd.get(1);
        try {
            r.e eVarC = c(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return eVarC == null ? new HashMap() : eVarC;
        } catch (UnsupportedEncodingException e) {
            aVar.b("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    public static r.e c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzzr(e);
        }
    }

    public static r.e d(JSONObject jSONObject) throws JSONException {
        r.e eVar = new r.e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objD = jSONObject.get(next);
            if (objD instanceof JSONArray) {
                objD = a((JSONArray) objD);
            } else if (objD instanceof JSONObject) {
                objD = d((JSONObject) objD);
            }
            eVar.put(next, objD);
        }
        return eVar;
    }
}
