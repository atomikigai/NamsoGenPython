package h3;

import android.content.DialogInterface;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import app.namso_gen.spacehowen.R;
import app.namso_gen.spacehowen.ui.browser.ProfileViewerActivity;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4785d;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, int i) {
        this.f4782a = i;
        this.f4783b = obj;
        this.f4784c = obj2;
        this.f4785d = obj3;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String string;
        String string2;
        int i10 = this.f4782a;
        Object obj = this.f4785d;
        Object obj2 = this.f4784c;
        Object obj3 = this.f4783b;
        switch (i10) {
            case 0:
                RadioGroup radioGroup = (RadioGroup) obj3;
                e1 e1Var = (e1) obj2;
                c1 c1Var = (c1) obj;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId < 0 || checkedRadioButtonId >= radioGroup.getChildCount()) {
                    string = (String) e1Var.D0.get(0);
                } else {
                    View childAt = radioGroup.getChildAt(checkedRadioButtonId);
                    jc.i.c(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
                    string = ((RadioButton) childAt).getText().toString();
                }
                Log.d("PremiumGate", "Gate seleccionado: " + string);
                dialogInterface.dismiss();
                c1Var.invoke(string);
                break;
            case 1:
                a2 a2Var = (a2) obj2;
                i3.f fVar = (i3.f) obj;
                Editable text = ((TextInputEditText) obj3).getText();
                yb.d dVar = null;
                String string3 = (text == null || (string2 = text.toString()) == null) ? null : pc.g.B0(string2).toString();
                if (string3 == null) {
                    string3 = "";
                }
                String str = string3;
                if (str.length() == 0) {
                    Toast.makeText(a2Var.U(), a2Var.v(R.string.note_empty_warning), 0).show();
                } else if (fVar != null) {
                    rc.b0.q(androidx.lifecycle.i0.e(a2Var.x()), null, new a2.e(a2Var, fVar, str, dVar, 3), 3);
                } else {
                    rc.b0.q(androidx.lifecycle.i0.e(a2Var.x()), null, new a2.g(a2Var, str, dVar, 11), 3);
                }
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                l3.t tVar = (l3.t) obj2;
                n3.b bVar = (n3.b) obj;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    tVar.g0(((Number) obj4).longValue(), false);
                }
                tVar.i0(bVar);
                break;
            case 3:
                l3.t tVar2 = (l3.t) obj3;
                long j4 = ((n3.b) obj2).f7238a;
                StringBuilder sbL = da.v.l("closeWindow #", " → rutaViva=", j4);
                n3.i iVar = n3.i.f7270a;
                sbL.append(n3.i.e(j4));
                Log.i("KRYPT-PROXY", sbL.toString());
                tVar2.g0(j4, false);
                tVar2.i0((n3.b) obj);
                break;
            default:
                ConcurrentHashMap concurrentHashMap = ProfileViewerActivity.P;
                a.a.c(((n3.b) obj3).f7238a);
                a.a.p((androidx.fragment.app.w) obj2, (n3.b) obj);
                break;
        }
    }
}
