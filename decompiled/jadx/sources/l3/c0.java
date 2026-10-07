package l3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6527a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.f f6529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6530d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(androidx.fragment.app.w wVar, jc.q qVar, g.f fVar, c3.j jVar) {
        this.f6528b = wVar;
        this.f6530d = qVar;
        this.f6529c = fVar;
        this.e = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i;
        int i10 = this.f6527a;
        int i11 = 3;
        Object obj = this.e;
        Object obj2 = this.f6530d;
        switch (i10) {
            case 0:
                jc.q qVar = (jc.q) obj2;
                c3.j jVar = (c3.j) obj;
                Float fValueOf = Float.valueOf(20.0f);
                List listI0 = vb.i.i0(qd.b.u(), new xb.a(new ic.l[]{new h3.o(9), new h3.o(10)}));
                boolean zIsEmpty = listI0.isEmpty();
                androidx.fragment.app.w wVar = this.f6528b;
                if (!zIsEmpty) {
                    final float f10 = wVar.getResources().getDisplayMetrics().density;
                    ic.l lVar = new ic.l() { // from class: l3.a0
                        @Override // ic.l
                        public final Object invoke(Object obj3) {
                            return Integer.valueOf((int) (((Float) obj3).floatValue() * f10));
                        }
                    };
                    LinearLayout linearLayout = new LinearLayout(wVar);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(((Number) lVar.invoke(fValueOf)).intValue(), ((Number) lVar.invoke(Float.valueOf(8.0f))).intValue(), ((Number) lVar.invoke(fValueOf)).intValue(), 0);
                    EditText editText = new EditText(wVar);
                    editText.setSingleLine(true);
                    editText.setInputType(1);
                    editText.setHint(wVar.getString(R.string.proxy_pick_search));
                    editText.setTextColor(wVar.getColor(R.color.text_primary));
                    editText.setHintTextColor(wVar.getColor(R.color.text_secondary));
                    editText.setTextSize(14.0f);
                    linearLayout.addView(editText, new LinearLayout.LayoutParams(-1, -2));
                    TextView textView = new TextView(wVar);
                    textView.setText(R.string.proxy_pick_no_match);
                    textView.setPadding(0, ((Number) lVar.invoke(Float.valueOf(14.0f))).intValue(), 0, ((Number) lVar.invoke(Float.valueOf(6.0f))).intValue());
                    textView.setGravity(17);
                    textView.setTextColor(wVar.getColor(R.color.text_secondary));
                    textView.setVisibility(8);
                    linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
                    RecyclerView recyclerView = new RecyclerView(wVar, null);
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                    recyclerView.setPadding(0, ((Number) lVar.invoke(Float.valueOf(4.0f))).intValue(), 0, 0);
                    linearLayout.addView(recyclerView, new LinearLayout.LayoutParams(-1, ((Number) lVar.invoke(Float.valueOf(480.0f))).intValue()));
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(listI0);
                    recyclerView.setAdapter(new g0(wVar, arrayList, qVar, this.f6529c, jVar));
                    editText.addTextChangedListener(new b5.a(arrayList, listI0, textView, recyclerView));
                    ea.j jVar2 = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                    jVar2.l(R.string.profile_pick_title);
                    ((g.b) jVar2.f3530b).f3983s = linearLayout;
                    jVar2.g(R.string.cancel, null);
                    r7.g.f8212c = jVar2.m();
                } else {
                    ea.j jVar3 = new ea.j((Context) wVar, R.style.KryptProxyDialog);
                    jVar3.l(R.string.profiles_pick_empty_title);
                    jVar3.f(R.string.profiles_pick_empty_msg);
                    jVar3.j(R.string.add_proxies, new h3.o0(wVar, i11));
                    jVar3.g(R.string.cancel, null);
                    jVar3.m();
                }
                break;
            default:
                final j3.b bVar = (j3.b) obj2;
                final jc.o oVar = (jc.o) obj;
                EditText editText2 = bVar.f5652a;
                TextView textView2 = bVar.f5658j;
                final String string = pc.g.B0(editText2.getText().toString()).toString();
                EditText editText3 = bVar.f5654c;
                Integer numY = pc.n.Y(pc.g.B0(editText3.getText().toString()).toString());
                final int iIntValue = numY != null ? numY.intValue() : 0;
                int length = string.length();
                final androidx.fragment.app.w wVar2 = this.f6528b;
                if (length == 0) {
                    editText2.setError(wVar2.getString(R.string.proxy_bad_host));
                } else if (1 <= iIntValue && iIntValue < 65536) {
                    if (bVar.e.isChecked()) {
                        i = 1;
                    } else if (bVar.f5657g.isChecked()) {
                        i = 2;
                    } else {
                        i = bVar.f5656f.isChecked() ? 3 : 0;
                    }
                    final String string2 = pc.g.B0(bVar.f5655d.getText().toString()).toString();
                    final String string3 = bVar.f5653b.getText().toString();
                    final g.f fVar = this.f6529c;
                    final Button buttonB = fVar.b(-1);
                    buttonB.setEnabled(false);
                    textView2.setVisibility(0);
                    textView2.setText(wVar2.getString(R.string.proxy_testing));
                    new Thread(new Runnable() { // from class: l3.l0
                        @Override // java.lang.Runnable
                        public final void run() {
                            n3.i iVar = n3.i.f7270a;
                            final String str = string;
                            jc.i.e(str, "host");
                            final String str2 = string2;
                            jc.i.e(str2, "user");
                            final String str3 = string3;
                            jc.i.e(str3, "pass");
                            final int i12 = i;
                            final int i13 = iIntValue;
                            n3.h hVarJ = n3.i.j(i12, i13, str, str2, str3);
                            final int i14 = hVarJ.f7264a ? 0 : hVarJ.f7265b;
                            androidx.fragment.app.w wVar3 = wVar2;
                            if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                                return;
                            }
                            final Button button = buttonB;
                            final j3.b bVar2 = bVar;
                            final jc.o oVar2 = oVar;
                            final g.f fVar2 = fVar;
                            wVar3.runOnUiThread(new Runnable() { // from class: l3.m0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i15;
                                    int i16 = i14;
                                    if (i16 != 0) {
                                        button.setEnabled(true);
                                        TextView textView3 = bVar2.f5658j;
                                        if (i16 != 1) {
                                            i15 = i16 != 2 ? R.string.proxy_err_no_internet : R.string.proxy_err_auth;
                                        } else {
                                            i15 = R.string.proxy_err_connect;
                                        }
                                        textView3.setText(i15);
                                        return;
                                    }
                                    i3.p.b().edit().putInt("proxy_type", i12).apply();
                                    String str4 = str;
                                    jc.i.e(str4, "v");
                                    i3.p.b().edit().putString("proxy_host", str4).apply();
                                    i3.p.b().edit().putInt("proxy_port", i13).apply();
                                    String str5 = str2;
                                    jc.i.e(str5, "v");
                                    i3.p.b().edit().putString("proxy_user", str5).apply();
                                    String str6 = str3;
                                    jc.i.e(str6, "v");
                                    i3.p.b().edit().putString("proxy_pass", str6).apply();
                                    oVar2.f5774a = true;
                                    fVar2.dismiss();
                                }
                            });
                        }
                    }).start();
                } else {
                    editText3.setError(wVar2.getString(R.string.proxy_bad_port));
                }
                break;
        }
    }

    public /* synthetic */ c0(j3.b bVar, androidx.fragment.app.w wVar, g.f fVar, jc.o oVar) {
        this.f6530d = bVar;
        this.f6528b = wVar;
        this.f6529c = fVar;
        this.e = oVar;
    }
}
