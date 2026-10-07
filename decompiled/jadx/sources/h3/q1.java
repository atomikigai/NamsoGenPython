package h3;

import androidx.viewpager2.widget.ViewPager2;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4815b;

    public /* synthetic */ q1(MainActivity mainActivity, int i) {
        this.f4814a = i;
        this.f4815b = mainActivity;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        switch (this.f4814a) {
            case 0:
                final boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final MainActivity mainActivity = this.f4815b;
                mainActivity.f1287d0 = zBooleanValue;
                mainActivity.runOnUiThread(new Runnable() { // from class: h3.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = MainActivity.f1283j0;
                        MainActivity mainActivity2 = mainActivity;
                        mainActivity2.t();
                        if (zBooleanValue) {
                            return;
                        }
                        mainActivity2.x();
                    }
                });
                break;
            default:
                int iIntValue = ((Integer) obj).intValue();
                ViewPager2 viewPager2 = this.f4815b.K;
                if (viewPager2 == null) {
                    jc.i.i("viewPager");
                    throw null;
                }
                int i = 0;
                if (iIntValue != R.id.navigation_home) {
                    if (iIntValue == R.id.navigation_browser) {
                        i = 1;
                    } else if (iIntValue == R.id.navigation_dashboard) {
                        i = 2;
                    } else if (iIntValue == R.id.navigation_notes) {
                        i = 3;
                    } else if (iIntValue == R.id.navigation_temp_mail) {
                        i = 4;
                    }
                }
                viewPager2.setCurrentItem(i);
                break;
                break;
        }
        return ub.k.f9073a;
    }
}
