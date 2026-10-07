package h3;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4751b;

    public /* synthetic */ k1(MainActivity mainActivity, int i) {
        this.f4750a = i;
        this.f4751b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f4750a;
        MainActivity mainActivity = this.f4751b;
        switch (i10) {
            case 0:
                int i11 = MainActivity.f1283j0;
                mainActivity.finish();
                return;
            case 1:
                int i12 = MainActivity.f1283j0;
                try {
                    mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=app.namso_gen.spacehowen")));
                    return;
                } catch (Exception unused) {
                    Toast.makeText(mainActivity.getApplicationContext(), mainActivity.getString(R.string.error_something_went_wrong), 0).show();
                    return;
                }
            case 2:
                jb.b bVar = mainActivity.P;
                if (bVar == null) {
                    jc.i.i("remoteConfig");
                    throw null;
                }
                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bVar.c("alert_url"))));
                mainActivity.finish();
                return;
            default:
                int i13 = MainActivity.f1283j0;
                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=app.namso_gen.spacehowen")));
                return;
        }
    }
}
