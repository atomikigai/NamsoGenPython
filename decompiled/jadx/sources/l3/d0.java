package l3;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import h3.n2;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.w f6543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6544d;
    public final /* synthetic */ g.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6545f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6546r;

    public /* synthetic */ d0(jc.o oVar, androidx.fragment.app.w wVar, ArrayList arrayList, jc.o oVar2, g.f fVar, ic.a aVar) {
        this.f6541a = 2;
        this.f6542b = oVar;
        this.f6543c = wVar;
        this.f6544d = arrayList;
        this.f6545f = oVar2;
        this.e = fVar;
        this.f6546r = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.f6541a) {
            case 0:
                n3.b bVar = (n3.b) this.f6542b;
                c3.j jVar = (c3.j) this.f6544d;
                ic.l lVar = (ic.l) this.f6545f;
                jc.q qVar = (jc.q) this.f6546r;
                androidx.fragment.app.w wVar = this.f6543c;
                if (r7.g.F(bVar, wVar, jVar)) {
                    r7.g.D(wVar, bVar, jVar, qVar, new h3.c1(3, this.e, lVar));
                    return;
                }
                return;
            case 1:
                n3.b bVar2 = (n3.b) this.f6542b;
                c3.j jVar2 = (c3.j) this.f6544d;
                ic.l lVar2 = (ic.l) this.f6545f;
                jc.q qVar2 = (jc.q) this.f6546r;
                androidx.fragment.app.w wVar2 = this.f6543c;
                if (r7.g.F(bVar2, wVar2, jVar2)) {
                    r7.g.D(wVar2, bVar2, jVar2, qVar2, new b0(this.e, wVar2, lVar2));
                    return;
                }
                return;
            default:
                jc.o oVar = (jc.o) this.f6542b;
                ArrayList arrayList = (ArrayList) this.f6544d;
                jc.o oVar2 = (jc.o) this.f6545f;
                ic.a aVar = (ic.a) this.f6546r;
                if (oVar.f5774a) {
                    return;
                }
                final n0 n0Var = new n0(arrayList, oVar2, this.e, aVar);
                androidx.fragment.app.w wVar3 = this.f6543c;
                if (wVar3.isFinishing() || wVar3.isDestroyed()) {
                    return;
                }
                View viewInflate = wVar3.getLayoutInflater().inflate(R.layout.dialog_proxy, (ViewGroup) null, false);
                int i = R.id.et_proxy_host;
                EditText editText = (EditText) r7.g.o(viewInflate, R.id.et_proxy_host);
                if (editText != null) {
                    i = R.id.et_proxy_pass;
                    EditText editText2 = (EditText) r7.g.o(viewInflate, R.id.et_proxy_pass);
                    if (editText2 != null) {
                        i = R.id.et_proxy_port;
                        EditText editText3 = (EditText) r7.g.o(viewInflate, R.id.et_proxy_port);
                        if (editText3 != null) {
                            i = R.id.et_proxy_user;
                            EditText editText4 = (EditText) r7.g.o(viewInflate, R.id.et_proxy_user);
                            if (editText4 != null) {
                                i = R.id.rb_http;
                                RadioButton radioButton = (RadioButton) r7.g.o(viewInflate, R.id.rb_http);
                                if (radioButton != null) {
                                    i = R.id.rb_https;
                                    RadioButton radioButton2 = (RadioButton) r7.g.o(viewInflate, R.id.rb_https);
                                    if (radioButton2 != null) {
                                        i = R.id.rb_socks4;
                                        RadioButton radioButton3 = (RadioButton) r7.g.o(viewInflate, R.id.rb_socks4);
                                        if (radioButton3 != null) {
                                            i = R.id.rb_socks5;
                                            RadioButton radioButton4 = (RadioButton) r7.g.o(viewInflate, R.id.rb_socks5);
                                            if (radioButton4 != null) {
                                                i = R.id.rg_row1;
                                                RadioGroup radioGroup = (RadioGroup) r7.g.o(viewInflate, R.id.rg_row1);
                                                if (radioGroup != null) {
                                                    i = R.id.rg_row2;
                                                    RadioGroup radioGroup2 = (RadioGroup) r7.g.o(viewInflate, R.id.rg_row2);
                                                    if (radioGroup2 != null) {
                                                        i = R.id.tv_import_list;
                                                        TextView textView = (TextView) r7.g.o(viewInflate, R.id.tv_import_list);
                                                        if (textView != null) {
                                                            i = R.id.tv_proxy_status;
                                                            TextView textView2 = (TextView) r7.g.o(viewInflate, R.id.tv_proxy_status);
                                                            if (textView2 != null) {
                                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                final j3.b bVar3 = new j3.b(linearLayout, editText, editText2, editText3, editText4, radioButton, radioButton2, radioButton3, radioButton4, radioGroup, radioGroup2, textView, textView2);
                                                                radioButton.setChecked(true);
                                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                                                                final int i10 = 0;
                                                                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l3.j0
                                                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                                    public final void onCheckedChanged(RadioGroup radioGroup3, int i11) {
                                                                        switch (i10) {
                                                                            case 0:
                                                                                jc.i.e(radioGroup3, "<unused var>");
                                                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                if (atomicBoolean2.compareAndSet(false, true)) {
                                                                                    bVar3.i.clearCheck();
                                                                                    atomicBoolean2.set(false);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                jc.i.e(radioGroup3, "<unused var>");
                                                                                AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                                                if (atomicBoolean3.compareAndSet(false, true)) {
                                                                                    bVar3.h.clearCheck();
                                                                                    atomicBoolean3.set(false);
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                final int i11 = 1;
                                                                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l3.j0
                                                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                                    public final void onCheckedChanged(RadioGroup radioGroup3, int i12) {
                                                                        switch (i11) {
                                                                            case 0:
                                                                                jc.i.e(radioGroup3, "<unused var>");
                                                                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                if (atomicBoolean2.compareAndSet(false, true)) {
                                                                                    bVar3.i.clearCheck();
                                                                                    atomicBoolean2.set(false);
                                                                                }
                                                                                break;
                                                                            default:
                                                                                jc.i.e(radioGroup3, "<unused var>");
                                                                                AtomicBoolean atomicBoolean3 = atomicBoolean;
                                                                                if (atomicBoolean3.compareAndSet(false, true)) {
                                                                                    bVar3.h.clearCheck();
                                                                                    atomicBoolean3.set(false);
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                });
                                                                final jc.o oVar3 = new jc.o();
                                                                ea.j jVar3 = new ea.j((Context) wVar3, R.style.KryptProxyDialog);
                                                                jVar3.l(R.string.proxy_add_title);
                                                                ((g.b) jVar3.f3530b).f3983s = linearLayout;
                                                                jVar3.j(R.string.proxy_save, null);
                                                                jVar3.g(R.string.proxy_cancel, new n2(1));
                                                                g.f fVarA = jVar3.a();
                                                                fVarA.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l3.k0
                                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                                    public final void onDismiss(DialogInterface dialogInterface) throws JSONException {
                                                                        n0Var.invoke(Boolean.valueOf(oVar3.f5774a));
                                                                    }
                                                                });
                                                                textView.setVisibility(8);
                                                                fVarA.show();
                                                                fVarA.b(-1).setOnClickListener(new c0(bVar3, wVar3, fVarA, oVar3));
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public /* synthetic */ d0(n3.b bVar, androidx.fragment.app.w wVar, c3.j jVar, g.f fVar, ic.l lVar, jc.q qVar, int i) {
        this.f6541a = i;
        this.f6542b = bVar;
        this.f6543c = wVar;
        this.f6544d = jVar;
        this.e = fVar;
        this.f6545f = lVar;
        this.f6546r = qVar;
    }
}
