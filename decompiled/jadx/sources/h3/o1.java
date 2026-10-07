package h3;

import android.util.Log;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbml;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4793b;

    public /* synthetic */ o1(MainActivity mainActivity, int i) {
        this.f4792a = i;
        this.f4793b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4792a;
        MainActivity mainActivity = this.f4793b;
        switch (i) {
            case 0:
                int i10 = MainActivity.f1283j0;
                mainActivity.A();
                break;
            case 1:
                int i11 = MainActivity.f1283j0;
                mainActivity.A();
                break;
            case 2:
                zzbml zzbmlVar = mainActivity.S;
                if (zzbmlVar == null) {
                    mainActivity.w();
                } else {
                    zzbmlVar.show(mainActivity);
                }
                break;
            case 3:
                int i12 = MainActivity.f1283j0;
                try {
                    String str = mainActivity.Y ? "GONE" : "VISIBLE";
                    Log.d(mainActivity.W, "updateAdVisibility: isPremium=" + mainActivity.Y + " -> banner=" + str);
                    if (mainActivity.R != null) {
                        mainActivity.u().setVisibility(mainActivity.Y ? 8 : 0);
                    }
                } catch (Exception e) {
                    Log.e(mainActivity.W, "Error al actualizar visibilidad de anuncios: " + e.getMessage());
                    return;
                }
                break;
            case 4:
                if (mainActivity.Y) {
                    Toast.makeText(mainActivity.getApplicationContext(), mainActivity.getString(R.string.welcome_back_ads), 1).show();
                }
                break;
            default:
                int i13 = MainActivity.f1283j0;
                mainActivity.A();
                break;
        }
    }
}
