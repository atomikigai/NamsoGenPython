package h3;

import android.graphics.Color;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements q3.m, q3.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f4691b;

    public /* synthetic */ f0(g0 g0Var, int i) {
        this.f4690a = i;
        this.f4691b = g0Var;
    }

    @Override // q3.l
    public void c(q3.n nVar) {
        switch (this.f4690a) {
            case 1:
                ProgressBar progressBar = this.f4691b.k0;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                    return;
                } else {
                    jc.i.i("loader");
                    throw null;
                }
            default:
                ProgressBar progressBar2 = this.f4691b.k0;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    return;
                } else {
                    jc.i.i("loader");
                    throw null;
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    @Override // q3.m
    public void e(Object obj) {
        String strV;
        JSONObject jSONObject = (JSONObject) obj;
        switch (this.f4690a) {
            case 0:
                String strOptString = jSONObject.optString("ip", "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IP: " + jSONObject.optString("ip", "") + '\n');
                sb2.append("Country Name: " + jSONObject.optString("country_name", "") + '\n');
                sb2.append("Region Name: " + jSONObject.optString("region_name", "") + '\n');
                sb2.append("City: " + jSONObject.optString("city", "") + '\n');
                StringBuilder sb3 = new StringBuilder("Zip Code: ");
                sb3.append(jSONObject.optString("zip_code", ""));
                sb2.append(sb3.toString());
                g0 g0Var = this.f4691b;
                EditText editText = g0Var.f4706j0;
                if (editText == null) {
                    jc.i.i("ipDetailsEditText");
                    throw null;
                }
                editText.setText(sb2.toString());
                jc.i.b(strOptString);
                jb.b bVarB = jb.b.b();
                jc.i.d(bVarB, "getInstance(...)");
                bVarB.a().addOnCompleteListener(new e5.d(bVarB, strOptString, g0Var, 4));
                return;
            default:
                int iOptInt = jSONObject.optInt("score", 0);
                String strOptString2 = jSONObject.optString("risk", "");
                jc.i.b(strOptString2);
                int color = Color.parseColor("#d5c0f4");
                g0 g0Var2 = this.f4691b;
                LinearProgressIndicator linearProgressIndicator = g0Var2.f4702f0;
                if (linearProgressIndicator == null) {
                    jc.i.i("scoreBar");
                    throw null;
                }
                linearProgressIndicator.b(jd.d.g(iOptInt, 100), true);
                LinearProgressIndicator linearProgressIndicator2 = g0Var2.f4702f0;
                if (linearProgressIndicator2 == null) {
                    jc.i.i("scoreBar");
                    throw null;
                }
                linearProgressIndicator2.setIndicatorColor(color);
                LinearProgressIndicator linearProgressIndicator3 = g0Var2.f4702f0;
                if (linearProgressIndicator3 == null) {
                    jc.i.i("scoreBar");
                    throw null;
                }
                linearProgressIndicator3.setTrackColor(Color.parseColor("#33888888"));
                TextView textView = g0Var2.f4703g0;
                if (textView == null) {
                    jc.i.i("scoreBigTextView");
                    throw null;
                }
                textView.setTextColor(color);
                TextView textView2 = g0Var2.f4703g0;
                if (textView2 == null) {
                    jc.i.i("scoreBigTextView");
                    throw null;
                }
                textView2.setText(g0Var2.w(R.string.fraud_score_big_percent, Integer.valueOf(iOptInt)));
                TextView textView3 = g0Var2.f4704h0;
                if (textView3 == null) {
                    jc.i.i("riskTextView");
                    throw null;
                }
                textView3.setTextColor(color);
                TextView textView4 = g0Var2.f4704h0;
                if (textView4 == null) {
                    jc.i.i("riskTextView");
                    throw null;
                }
                String lowerCase = pc.g.B0(strOptString2).toString().toLowerCase(Locale.ROOT);
                jc.i.d(lowerCase, "toLowerCase(...)");
                int iHashCode = lowerCase.hashCode();
                if (iHashCode != -1078030475) {
                    if (iHashCode != 107348) {
                        if (iHashCode == 3202466 && lowerCase.equals("high")) {
                            strV = g0Var2.v(R.string.risk_high);
                            jc.i.d(strV, "getString(...)");
                        } else {
                            strV = g0Var2.w(R.string.risk_format, strOptString2);
                            jc.i.d(strV, "getString(...)");
                        }
                    } else if (lowerCase.equals("low")) {
                        strV = g0Var2.v(R.string.risk_low);
                        jc.i.d(strV, "getString(...)");
                    } else {
                        strV = g0Var2.w(R.string.risk_format, strOptString2);
                        jc.i.d(strV, "getString(...)");
                    }
                } else if (lowerCase.equals("medium")) {
                    strV = g0Var2.v(R.string.risk_medium);
                    jc.i.d(strV, "getString(...)");
                } else {
                    strV = g0Var2.w(R.string.risk_format, strOptString2);
                    jc.i.d(strV, "getString(...)");
                }
                textView4.setText(strV);
                ProgressBar progressBar = g0Var2.k0;
                if (progressBar == null) {
                    jc.i.i("loader");
                    throw null;
                }
                progressBar.setVisibility(8);
                LinearLayout linearLayout = g0Var2.f4707l0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                } else {
                    jc.i.i("layoutResult");
                    throw null;
                }
        }
    }
}
