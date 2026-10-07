package w5;

import android.os.Bundle;
import android.os.RemoteException;
import e6.f2;
import e6.t3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f9668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9669b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f9670c;

    public t(f2 f2Var) {
        this.f9668a = f2Var;
        if (f2Var != null) {
            try {
                List<t3> listZzj = f2Var.zzj();
                if (listZzj != null) {
                    for (t3 t3Var : listZzj) {
                        i iVar = t3Var != null ? new i(t3Var) : null;
                        if (iVar != null) {
                            this.f9669b.add(iVar);
                        }
                    }
                }
            } catch (RemoteException e) {
                i6.h.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        f2 f2Var2 = this.f9668a;
        if (f2Var2 == null) {
            return;
        }
        try {
            t3 t3VarZzf = f2Var2.zzf();
            if (t3VarZzf != null) {
                this.f9670c = new i(t3VarZzf);
            }
        } catch (RemoteException e4) {
            i6.h.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e4);
        }
    }

    public final JSONObject a() throws JSONException {
        String strZzi;
        Bundle bundleZze;
        JSONObject jSONObject = new JSONObject();
        String strZzg = null;
        f2 f2Var = this.f9668a;
        if (f2Var != null) {
            try {
                strZzi = f2Var.zzi();
            } catch (RemoteException e) {
                i6.h.e("Could not forward getResponseId to ResponseInfo.", e);
                strZzi = null;
            }
        } else {
            strZzi = null;
        }
        if (strZzi == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strZzi);
        }
        if (f2Var != null) {
            try {
                strZzg = f2Var.zzg();
            } catch (RemoteException e4) {
                i6.h.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e4);
            }
        }
        if (strZzg == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZzg);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f9669b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((i) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        i iVar = this.f9670c;
        if (iVar != null) {
            jSONObject.put("Loaded Adapter Response", iVar.a());
        }
        if (f2Var != null) {
            try {
                bundleZze = f2Var.zze();
            } catch (RemoteException e10) {
                i6.h.e("Could not forward getResponseExtras to ResponseInfo.", e10);
                bundleZze = new Bundle();
            }
        } else {
            bundleZze = new Bundle();
        }
        if (bundleZze != null) {
            jSONObject.put("Response Extras", e6.s.f3427f.f3428a.h(bundleZze));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
