package no.stelar7.api.l4j8.pojo.league;

import no.stelar7.api.l4j8.basic.constants.types.*;

import java.io.Serializable;
import java.util.Objects;

public class LeaguePosition implements Serializable
{
    private static final long serialVersionUID = -895051155625969402L;
    
    private String             rank;
    private GameQueueType      queueType;
    private boolean            hotStreak;
    private MiniSeries         miniSeries;
    private int                wins;
    private boolean            veteran;
    private int                losses;
    private String             summonerId;
    private String             leagueName;
    private String             summonerName;
    private boolean            inactive;
    private boolean            freshBlood;
    private LeaguePositionType position;
    private String             tier;
    private int                leaguePoints;
    private String             leagueId;
    
    public LeaguePositionType getPosition()
    {
        return position;
    }
    
    public String getRank()
    {
        return rank;
    }
    
    public GameQueueType getQueueType()
    {
        return queueType;
    }
    
    public boolean isHotStreak()
    {
        return hotStreak;
    }
    
    public MiniSeries getMiniSeries()
    {
        return miniSeries;
    }
    
    public boolean isInPromos()
    {
        return miniSeries != null;
    }
    
    public int getWins()
    {
        return wins;
    }
    
    public boolean isVeteran()
    {
        return veteran;
    }
    
    public int getLosses()
    {
        return losses;
    }
    
    public String getSummonerId()
    {
        return summonerId;
    }
    
    public String getLeagueName()
    {
        return leagueName;
    }
    
    public String getSummonerName()
    {
        return summonerName;
    }
    
    public boolean isInactive()
    {
        return inactive;
    }
    
    public boolean isFreshBlood()
    {
        return freshBlood;
    }
    
    public String getTier()
    {
        return tier;
    }
    
    public TierDivisionType getTierDivisionType()
    {
        return TierDivisionType.getFromCodes(tier, rank);
    }
    
    public int getLeaguePoints()
    {
        return leaguePoints;
    }
    
    public String getLeagueId()
    {
        return leagueId;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        LeaguePosition that = (LeaguePosition) o;
        return hotStreak == that.hotStreak &&
               wins == that.wins &&
               veteran == that.veteran &&
               losses == that.losses &&
               inactive == that.inactive &&
               freshBlood == that.freshBlood &&
               leaguePoints == that.leaguePoints &&
               Objects.equals(rank, that.rank) &&
               queueType == that.queueType &&
               Objects.equals(miniSeries, that.miniSeries) &&
               Objects.equals(summonerId, that.summonerId) &&
               Objects.equals(leagueName, that.leagueName) &&
               Objects.equals(summonerName, that.summonerName) &&
               position == that.position &&
               Objects.equals(tier, that.tier) &&
               Objects.equals(leagueId, that.leagueId);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(rank, queueType, hotStreak, miniSeries, wins, veteran, losses, summonerId, leagueName, summonerName, inactive, freshBlood, position, tier, leaguePoints, leagueId);
    }
    
    @Override
    public String toString()
    {
        return "LeaguePosition{" +
               "rank='" + rank + '\'' +
               ", queueType=" + queueType +
               ", hotStreak=" + hotStreak +
               ", miniSeries=" + miniSeries +
               ", wins=" + wins +
               ", veteran=" + veteran +
               ", losses=" + losses +
               ", summonerId='" + summonerId + '\'' +
               ", leagueName='" + leagueName + '\'' +
               ", summonerName='" + summonerName + '\'' +
               ", inactive=" + inactive +
               ", freshBlood=" + freshBlood +
               ", position=" + position +
               ", tier='" + tier + '\'' +
               ", leaguePoints=" + leaguePoints +
               ", leagueId='" + leagueId + '\'' +
               '}';
    }
    
}
