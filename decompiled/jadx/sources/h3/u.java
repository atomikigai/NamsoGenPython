package h3;

import android.util.Log;
import java.util.LinkedHashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f4852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4853b;

    public /* synthetic */ u(v vVar, String str) {
        this.f4852a = vVar;
        this.f4853b = str;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        Log.e("SaveBinToApi", "Error en la solicitud: " + nVar.getMessage());
        this.f4852a.f4868m0.remove(this.f4853b);
    }

    @Override // q3.m
    public void e(Object obj) {
        String str = this.f4853b;
        LinkedHashSet linkedHashSet = this.f4852a.f4868m0;
        JSONObject jSONObject = (JSONObject) obj;
        try {
            boolean z4 = jSONObject.getBoolean("success");
            String string = jSONObject.getString("message");
            if (z4) {
                Log.d("SaveBinToApi", "BIN guardado exitosamente: " + str);
            } else {
                Log.d("SaveBinToApi", "Error al guardar el BIN: " + string);
            }
        } catch (Exception e) {
            Log.e("SaveBinToApi", "Error al procesar la respuesta: " + e.getMessage());
        } finally {
            linkedHashSet.remove(str);
        }
    }

    public /* synthetic */ u(String str, v vVar) {
        this.f4853b = str;
        this.f4852a = vVar;
    }
}
