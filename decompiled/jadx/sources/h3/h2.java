package h3;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2 implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f4719a;

    public /* synthetic */ h2(i2 i2Var) {
        this.f4719a = i2Var;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        i2 i2Var = this.f4719a;
        ProgressBar progressBar = i2Var.f4733i0;
        if (progressBar == null) {
            jc.i.i("searchProgressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        Log.e("SearchBinDbFragment", "Error en la solicitud: " + nVar.getMessage());
        Context contextU = i2Var.U();
        String message = nVar.getMessage();
        if (message == null) {
            message = "";
        }
        Toast.makeText(contextU, i2Var.w(R.string.error_search, message), 0).show();
    }

    @Override // q3.m
    public void e(Object obj) {
        i2 i2Var = this.f4719a;
        try {
            JSONArray jSONArray = ((JSONObject) obj).getJSONArray("data");
            StringBuilder sb2 = new StringBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                sb2.append(jSONArray.getString(i) + '\n');
            }
            ProgressBar progressBar = i2Var.f4733i0;
            if (progressBar == null) {
                jc.i.i("searchProgressBar");
                throw null;
            }
            progressBar.setVisibility(8);
            if (sb2.length() <= 0) {
                Toast.makeText(i2Var.U(), i2Var.v(R.string.error_no_bins_found), 0).show();
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<b>");
            sb3.append(i2Var.v(R.string.extras_label));
            sb3.append("</b><br><br>");
            String string = sb2.toString();
            jc.i.d(string, "toString(...)");
            sb3.append(pc.g.B0(string).toString());
            String string2 = sb3.toString();
            EditText editText = i2Var.f4732h0;
            if (editText == null) {
                jc.i.i("searchResultEditText");
                throw null;
            }
            editText.setVisibility(0);
            EditText editText2 = i2Var.f4732h0;
            if (editText2 == null) {
                jc.i.i("searchResultEditText");
                throw null;
            }
            editText2.setText(Html.fromHtml(string2, 0));
        } catch (Exception e) {
            ProgressBar progressBar2 = i2Var.f4733i0;
            if (progressBar2 == null) {
                jc.i.i("searchProgressBar");
                throw null;
            }
            progressBar2.setVisibility(8);
            Log.e("SearchBinDbFragment", "Error al procesar los datos: " + e.getMessage());
            Toast.makeText(i2Var.U(), i2Var.v(R.string.error_process_data), 0).show();
        }
    }
}
