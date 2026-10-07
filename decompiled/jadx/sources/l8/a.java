package l8;

import android.graphics.Rect;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6869b;

    public /* synthetic */ a(Object obj, int i) {
        this.f6868a = i;
        this.f6869b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.f6868a;
        Object obj = this.f6869b;
        switch (i17) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i13 || i10 != i14 || i11 != i15 || i12 != i16) {
                    view.post(new androidx.activity.d(carouselLayoutManager, 16));
                }
                break;
            default:
                BadgeImageView badgeImageView = (BadgeImageView) obj;
                int i18 = BadgeImageView.e;
                i.e(badgeImageView, "this$0");
                if (badgeImageView.getVisibility() == 0) {
                    sb.b bVar = badgeImageView.f2746d;
                    Rect rect = new Rect();
                    badgeImageView.getDrawingRect(rect);
                    bVar.b(rect);
                }
                break;
        }
    }
}
