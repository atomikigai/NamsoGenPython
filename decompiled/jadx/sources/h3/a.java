package h3;

import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f4609a;

    public /* synthetic */ a(b bVar) {
        this.f4609a = bVar;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        b bVar = this.f4609a;
        ProgressBar progressBar = bVar.f4624i0;
        if (progressBar == null) {
            jc.i.i("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        Toast.makeText(bVar.U(), bVar.v(R.string.error_bin_query), 0).show();
        nVar.printStackTrace();
    }

    @Override // q3.m
    public void e(Object obj) {
        b bVar = this.f4609a;
        JSONObject jSONObject = (JSONObject) obj;
        jc.i.b(jSONObject);
        try {
            try {
                String strW = pc.h.W("\n                Status: Active\n                Scheme: " + jSONObject.optString("brand", bVar.v(R.string.unknown)) + "\n                Type: " + jSONObject.optString("type", bVar.v(R.string.unknown)) + "\n                Issuer: " + jSONObject.optString("bank", bVar.v(R.string.unknown)) + "\n                Card Tier: " + jSONObject.optString("level", bVar.v(R.string.unknown)) + "\n                Country: " + jSONObject.optString("country_name", bVar.v(R.string.unknown)) + ' ' + jSONObject.optString("country_flag", "") + "\n            ");
                EditText editText = bVar.f4623h0;
                if (editText == null) {
                    jc.i.i("resultEditText");
                    throw null;
                }
                editText.setText(strW);
                ProgressBar progressBar = bVar.f4624i0;
                if (progressBar == null) {
                    jc.i.i("progressBar");
                    throw null;
                }
                progressBar.setVisibility(8);
                EditText editText2 = bVar.f4623h0;
                if (editText2 != null) {
                    editText2.setVisibility(0);
                } else {
                    jc.i.i("resultEditText");
                    throw null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(bVar.U(), bVar.v(R.string.error_bin_process), 0).show();
                ProgressBar progressBar2 = bVar.f4624i0;
                if (progressBar2 == null) {
                    jc.i.i("progressBar");
                    throw null;
                }
                progressBar2.setVisibility(8);
                EditText editText3 = bVar.f4623h0;
                if (editText3 != null) {
                    editText3.setVisibility(0);
                } else {
                    jc.i.i("resultEditText");
                    throw null;
                }
            }
        } catch (Throwable th) {
            ProgressBar progressBar3 = bVar.f4624i0;
            if (progressBar3 == null) {
                jc.i.i("progressBar");
                throw null;
            }
            progressBar3.setVisibility(8);
            EditText editText4 = bVar.f4623h0;
            if (editText4 == null) {
                jc.i.i("resultEditText");
                throw null;
            }
            editText4.setVisibility(0);
            throw th;
        }
    }
}
