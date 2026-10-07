package h3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f4921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i3.f f4922c;

    public /* synthetic */ z1(a2 a2Var, i3.f fVar, int i) {
        this.f4920a = i;
        this.f4921b = a2Var;
        this.f4922c = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f4920a) {
            case 0:
                dialogInterface.dismiss();
                a2 a2Var = this.f4921b;
                a2Var.getClass();
                AlertDialog alertDialogCreate = new AlertDialog.Builder(a2Var.U(), R.style.MyDialogTheme).setTitle(a2Var.v(R.string.note_delete_confirm_title)).setMessage(a2Var.v(R.string.note_delete_confirm_message)).setPositiveButton(a2Var.v(R.string.btn_delete), new z1(a2Var, this.f4922c, 1)).setNegativeButton(a2Var.v(R.string.btn_cancel), (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.setOnShowListener(new p0(alertDialogCreate, 2));
                alertDialogCreate.show();
                break;
            default:
                a2 a2Var2 = this.f4921b;
                rc.b0.q(androidx.lifecycle.i0.e(a2Var2.x()), null, new a2.g(a2Var2, this.f4922c, null, 10), 3);
                break;
        }
    }
}
