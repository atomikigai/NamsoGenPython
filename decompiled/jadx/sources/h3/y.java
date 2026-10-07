package h3;

import android.util.Log;
import android.widget.ProgressBar;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f4900a;

    @Override // q3.l
    public void c(q3.n nVar) {
        ProgressBar progressBar = this.f4900a.f4913i0;
        if (progressBar == null) {
            jc.i.i("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        Log.e("GenerateDataFragment", "Error al cargar datos: " + nVar.getMessage());
    }

    @Override // q3.m
    public void e(Object obj) {
        z zVar = this.f4900a;
        try {
            zVar.k0 = (JSONObject) obj;
            zVar.c0();
            ProgressBar progressBar = zVar.f4913i0;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            } else {
                jc.i.i("progressBar");
                throw null;
            }
        } catch (Exception e) {
            ProgressBar progressBar2 = zVar.f4913i0;
            if (progressBar2 == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar2.setVisibility(8);
            Log.e("GenerateDataFragment", "Error al procesar JSON: " + e.getMessage());
        }
    }
}
