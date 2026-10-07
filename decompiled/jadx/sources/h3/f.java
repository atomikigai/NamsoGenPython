package h3;

import android.content.DialogInterface;
import android.widget.Button;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.NotificationHistoryActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.f f4689b;

    public /* synthetic */ f(g.f fVar, int i) {
        this.f4688a = i;
        this.f4689b = fVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.f4688a;
        g.f fVar = this.f4689b;
        switch (i) {
            case 0:
                int i10 = CheckerHistoryActivity.Q;
                Button buttonB = fVar.b(-1);
                if (buttonB != null) {
                    buttonB.setTextColor(-3159575);
                }
                Button buttonB2 = fVar.b(-2);
                if (buttonB2 != null) {
                    buttonB2.setTextColor(-3159575);
                }
                break;
            case 1:
                int i11 = CheckerHistoryActivity.Q;
                Button buttonB3 = fVar.b(-1);
                if (buttonB3 != null) {
                    buttonB3.setTextColor(-3159575);
                }
                Button buttonB4 = fVar.b(-2);
                if (buttonB4 != null) {
                    buttonB4.setTextColor(-3159575);
                }
                break;
            case 2:
                int i12 = NotificationHistoryActivity.O;
                Button buttonB5 = fVar.b(-1);
                if (buttonB5 != null) {
                    buttonB5.setTextColor(-3159575);
                }
                Button buttonB6 = fVar.b(-2);
                if (buttonB6 != null) {
                    buttonB6.setTextColor(-3159575);
                }
                break;
            case 3:
                int i13 = NotificationHistoryActivity.O;
                Button buttonB7 = fVar.b(-1);
                if (buttonB7 != null) {
                    buttonB7.setTextColor(-3159575);
                }
                Button buttonB8 = fVar.b(-2);
                if (buttonB8 != null) {
                    buttonB8.setTextColor(-3159575);
                }
                break;
            default:
                Button buttonB9 = fVar.b(-1);
                if (buttonB9 != null) {
                    buttonB9.setTextColor(-3159575);
                }
                Button buttonB10 = fVar.b(-2);
                if (buttonB10 != null) {
                    buttonB10.setTextColor(-3159575);
                }
                break;
        }
    }
}
